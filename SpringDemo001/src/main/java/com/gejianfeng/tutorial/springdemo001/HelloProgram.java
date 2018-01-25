package com.gejianfeng.tutorial.springdemo001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gejianfeng.tutorial.springdemo001.helloworld.HelloWorld;
import com.gejianfeng.tutorial.springdemo001.helloworld.HelloWorldService;

public class HelloProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorldService service = (HelloWorldService)context.getBean("helloWorldService");
		HelloWorld handler = service.getHwHandler();
		handler.sayHello();
	}

}
