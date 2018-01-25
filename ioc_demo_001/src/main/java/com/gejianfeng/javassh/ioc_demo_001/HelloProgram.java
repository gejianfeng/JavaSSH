/**
 * 
 */
package com.gejianfeng.javassh.ioc_demo_001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gejianfeng.javassh.ioc_demo_001.helloworld.HelloWorld;
import com.gejianfeng.javassh.ioc_demo_001.helloworld.HelloWorldService;

/**
 * @author gejianfeng
 *
 */
public class HelloProgram {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorldService service = (HelloWorldService)context.getBean("helloWorldService");
		HelloWorld hwHandler = service.getHwHandler();
		hwHandler.sayHello();
	}

}
