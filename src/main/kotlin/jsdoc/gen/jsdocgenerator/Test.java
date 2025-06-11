package jsdoc.gen.jsdocgenerator;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * <h1>Test</h1>
 * <hr>
 * <b>&gt; Test</b>
 *
 * @author jongg
 * @version 1.0.0
 * @since 2025.05.19(월) 오후 5:15
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Test {
	
	/**
	 * 이름
	 */
	private String name;
	
	/**
	 * 나이
	 */
	private int age;
	
	/**
	 * 별명
	 */
	private ArrayList<String> nicknames;
	
	private HashMap<String, Integer> count;
	
	/**
	 * 다른 프로퍼티들
	 * <p>
	 * 공백은 어떻게 될 지 궁금함
	 */
	private ArrayList<HashMap<String, LinkedList<String>>> otherProperties;
	
}
