package com.gejianfeng.tutorial.springjdbcdemo001.model;

public class Customer {
	int custId;
	String name;
	int age;
	
	public Customer(int custId, String name, int age) {
		this.custId = custId;
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the custId
	 */
	public int getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer [age=" + age + ", custId=" + custId + ", name=" + name + "]";
	}
	
	
}
