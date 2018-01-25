package com.gejianfeng.tutorial.springdemo003.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gejianfeng.tutorial.springdemo003.output.OutputHelper;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		OutputHelper helper = (OutputHelper)context.getBean("OutputHelper");
		helper.generatorOutput();
	}

}
