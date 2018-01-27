package com.gejianfeng.tutorial.springjdbcdemo001.dao;

import com.gejianfeng.tutorial.springjdbcdemo001.model.Customer;

public interface CustomerDAO {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
