package com.AppBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AppBackend.model.Employee;
import com.AppBackend.repository.EmployeeRepo;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	//Get all employee
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	
	} 
}
