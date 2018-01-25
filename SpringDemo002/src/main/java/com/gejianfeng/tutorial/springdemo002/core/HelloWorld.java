package com.gejianfeng.tutorial.springdemo002.core;

public class HelloWorld {

		private String name;
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void printHello() {
			System.out.println("Spring: Hello! " + name);
		}
}
