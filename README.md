# JsDocGenerator

> Javascript Document Generator
> 
> - Shortcut: Alt + D
> 
> **From.**
> 
> ```java
> @Getter
> @Setter
> public class People {
> 
>   /**
>    * People name
>    */
>   private String name;
> 
>   /**
>    * People age
>    */
>   private int age;
> 
>   /**
>    * People hobbys
>    */
>   private List<String> hobbys;
> }
> ```
>
> **To.**
> 
> ```javascript
> /**
>  * @typedef {Object} People
>  * @property {string} name People name
>  * @property {number} age People age
>  * @property {string[]} hobbys People hobbys
>  */
> ```

## Issues

### 1. com.intellij.psi
> ###### build.gradle.kts
> If don`t add build plugin "com.intellij.java", can`t use PsiJavaFile
> ```groovy
> dependencies {
>     intellijPlatform {
>         create("IC", "2024.2.5")
>         testFramework(org.jetbrains.intellij.platform.gradle.TestFrameworkType.Platform)
>         bundledPlugin("com.intellij.java") // (New!)
>     }
> }
> ```

### 2. org.jetbrains.kotlin.com.intellij.psi
> _kotlin-compiler-embeddable_ >>> ***Never Use!!!***
