package com.gejianfeng.tutorial.springjdbcdemo001.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gejianfeng.tutorial.springjdbcdemo001.dao.impl.JdbcCustomerDAO;
import com.gejianfeng.tutorial.springjdbcdemo001.model.Customer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JdbcCustomerDAO customerDAO = (JdbcCustomerDAO)context.getBean("jdbcCustomerDAO");
		Customer customer = new Customer(1, "Spring JDBC Demo 001", 10);
		customerDAO.insert(customer);
		
		Customer Ret = customerDAO.findByCustomerId(1);
		System.out.println(Ret.toString());
	}

}
