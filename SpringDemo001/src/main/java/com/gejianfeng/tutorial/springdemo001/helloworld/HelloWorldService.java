package com.gejianfeng.tutorial.springdemo001.helloworld;

public class HelloWorldService {
	private HelloWorld hwHandler = null;
	
	public HelloWorldService() {
		
	}

	/**
	 * @return the hwHandler
	 */
	public HelloWorld getHwHandler() {
		return hwHandler;
	}

	/**
	 * @param hwHandler the hwHandler to set
	 */
	public void setHwHandler(HelloWorld hwHandler) {
		this.hwHandler = hwHandler;
	}
	
	
}
