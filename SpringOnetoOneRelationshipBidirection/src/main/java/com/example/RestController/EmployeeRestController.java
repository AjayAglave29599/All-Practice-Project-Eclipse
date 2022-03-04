package com.example.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.EmployeeService;
import com.example.demo.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public List<Employee> listEmployee()
	{
		return employeeService.listEmployee();
	}
	
	@PostMapping("/")
	public Employee storeEmp(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee) ;
		
	}
	
	@PutMapping("/")
	public Employee updateEmp(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
		
	}
	
	@DeleteMapping("/")
	public String deleteEmp(@RequestBody Employee  employee )
	{
		 employeeService.deleteEmployee(employee);
		return "Delete Successfully";
		
	}
	
	

}
