package com.Demo.springbootCurd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.springbootCurd.Model.Employee;
import com.Demo.springbootCurd.Repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;

	
	//get all employee
	@GetMapping("/employees")
	public List<Employee>getAllEmployee(){
		return employeeRepository.findAll();
		
	}
}
