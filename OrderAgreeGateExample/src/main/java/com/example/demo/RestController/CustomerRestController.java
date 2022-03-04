package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.serviceImp.CustomerServiceImp;

@RestController
@Repository("/customer")
public class CustomerRestController {
	
	@Autowired
	public CustomerServiceImp customerServiceImp;
	
	@GetMapping("/")
	public List<Customer> getAllCustomer()
	{
		return customerServiceImp.listAllCustomer();
	}
	@PostMapping("/")
	public Customer StoreCustomer(@RequestBody Customer customer)
	{
		return customerServiceImp.saveCustomer(customer);
	}
	@PutMapping("/")
	public Customer UpdateCustomer(@RequestBody Customer customer)
	{
		return customerServiceImp.saveCustomer(customer);
	}
	public String deleteCustomer(@RequestBody Customer customer)
	{
		customerServiceImp.deleteCustomer(customer);
		return "Deleted Successfully";
	}


}
