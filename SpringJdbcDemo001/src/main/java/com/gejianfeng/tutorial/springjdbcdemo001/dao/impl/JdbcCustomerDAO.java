package com.gejianfeng.tutorial.springjdbcdemo001.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.gejianfeng.tutorial.springjdbcdemo001.dao.CustomerDAO;
import com.gejianfeng.tutorial.springjdbcdemo001.model.Customer;

public class JdbcCustomerDAO implements CustomerDAO {
	
	private DataSource dataSource = null;

	public void insert(Customer customer) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO CUSTOMER (CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customer.getCustId());
			ps.setString(2,  customer.getName());
			ps.setInt(3, customer.getAge());
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException ex) {
			throw new RuntimeException(ex);
		}
		finally {
			if (conn != null) {
				try {
					conn.close();
				}
				catch(SQLException ex) {
					
				}
			}
		}
	}

	public Customer findByCustomerId(int custId) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, custId);
			Customer customer = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				customer = new Customer(rs.getInt("CUST_ID"), rs.getString("NAME"), rs.getInt("AGE"));
			}
			rs.close();
			ps.close();
			conn.close();
			return customer;
		}
		catch(SQLException ex) {
			throw new RuntimeException(ex);
		}
		finally {
			if (conn != null)
			{
				try {
					conn.close();
				}
				catch(SQLException ex) {
					
				}
			}
		}
	}

	/**
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
