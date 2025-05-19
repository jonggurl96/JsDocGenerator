package jsdoc.gen.jsdocgenerator

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiJavaFile
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection

/**
 * JsDocConverter
 *
 * > Copy JsDoc From Java Class on Clipboard
 *
 * @since 2025.05.19(월) 오후 3:30
 * @author jongg
 * @version 1.0.0
 */
class JsDocConverter : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        // 1. Extract File Info
        val project = e.project ?: return
        val psiFile: PsiFile = e.getData(CommonDataKeys.PSI_FILE) ?: return

        // 2. Check is Java
        if(psiFile !is PsiJavaFile) {
            showError(project, "You can only convert Java Class File.")
            return
        }

        // 3. Extract Class
        val psiClass: PsiClass? = psiFile.classes.firstOrNull()
        if(psiClass == null) {
            showError(project, "Java Class is not Found.")
            return
        }

        // 4. Get File Members
        val memberInfo: String = psiClass
            .fields
            .map { field -> " * @property {${field.type.presentableText}} ${field.name} ${field.docComment?.text}" }
            .joinToString { "\n" }

        // 5. Generate JsDoc
        val jsDoc = """
            /**
             * @typedef {Object} ${psiClass.name}
             $memberInfo
             */
        """.trimIndent()

        // 6. Copy to Clipboard
        val clipboard = Toolkit.getDefaultToolkit().systemClipboard
        val selection = StringSelection(jsDoc)
        clipboard.setContents(selection, selection)

        Messages.showMessageDialog(project, "Copied JsDoc to Clipboard.", "JsDoc Copied!", Messages.getInformationIcon())
    }

    private fun showError(project: Project, message: String) {
        Messages.showMessageDialog(project, message, "Generate JsDoc Error", Messages.getErrorIcon())
    }
}