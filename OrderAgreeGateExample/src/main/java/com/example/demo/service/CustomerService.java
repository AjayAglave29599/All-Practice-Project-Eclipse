package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;


public interface CustomerService {
	
	public List<Customer> listAllCustomer();
	public Customer saveCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public String deleteCustomer(Customer customer);
	
}
