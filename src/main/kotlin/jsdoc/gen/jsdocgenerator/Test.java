package jsdoc.gen.jsdocgenerator;


/**
 * <h1>Test</h1>
 * <hr>
 * <b>&gt; Test</b>
 *
 * @author jongg
 * @version 1.0.0
 * @since 2025.05.19(월) 오후 5:15
 */
public class Test {
	
	/**
	 * 이름
	 */
	private String name;
	
	/**
	 * 나이
	 */
	private int age;
	
	public Test() {}
	
	public Test(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
