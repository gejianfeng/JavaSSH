/**
 * 
 */
package com.gejianfeng.javassh.spring_demo_001;

/**
 * @author gejianfeng
 *
 */
public class HelloWorld {

	public String name;

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void printHelloWorld() {
		System.out.println("Spring: Hello! " + name);
	}
}
