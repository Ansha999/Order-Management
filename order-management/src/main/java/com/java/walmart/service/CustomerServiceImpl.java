package com.java.walmart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.walmart.entity.Customer;
import com.java.walmart.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
	private CustomerRepository repository;
	@Override
	public void savecustomer(Customer customer) {
		// TODO Auto-generated method stub
		repository.save(customer);
	}
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
