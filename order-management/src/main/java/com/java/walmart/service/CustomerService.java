package com.java.walmart.service;

import java.util.List;

import com.java.walmart.entity.Customer;

public interface CustomerService {

	public void savecustomer(Customer customer);
	
	public List<Customer> getAllCustomers();
}
