package com.example.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
@Service
public interface EmployeeService  {
	
	public Employee saveEmployee(Employee employee);
	public List<Employee> listEmployee();
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(Employee employee);
	
	

}
