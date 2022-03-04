package com.example.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Repository.EmployeeRepository;
import com.example.Service.EmployeeService;
import com.example.demo.model.Employee;

public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public String deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.delete(employee);
		return "Deleted Successfully";
	}

}
