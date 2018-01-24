package com.gejianfeng.javassh.spring.core;

public class HelloWorld {
	
	private String name;

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
