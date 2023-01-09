package org.spring.demo.DI;


public class DISub {
	private String name;
	private String age;
	public DISub() {
		System.out.println("Basic Constructor");
	}
	public DISub(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
}
