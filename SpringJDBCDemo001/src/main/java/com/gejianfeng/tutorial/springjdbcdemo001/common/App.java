package com.gejianfeng.tutorial.springjdbcdemo001.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gejianfeng.tutorial.springjdbcdemo001.dao.CustomerDAO;
import com.gejianfeng.tutorial.springjdbcdemo001.model.Customer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CustomerDAO customerDAO = (CustomerDAO)context.getBean("customerDAO");
		Customer customer = new Customer(1, "JDBC Demo", 29);
		customerDAO.insert(customer);
		
		Customer customer1 = customerDAO.findByCustomerId(1);
		System.out.println(customer1);
	}

}
