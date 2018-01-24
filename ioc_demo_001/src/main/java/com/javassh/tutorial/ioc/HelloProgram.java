package com.javassh.tutorial.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javassh.tutorial.ioc.helloworld.HelloWorld;
import com.javassh.tutorial.ioc.helloworld.HelloWorldService;

public class HelloProgram {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorldService service = (HelloWorldService)context.getBean("helloWorldService");
		HelloWorld hw = service.getHwHandler();
		
		hw.sayHello();
	}

}
