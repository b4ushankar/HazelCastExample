package com.shankar.hazlecast.controller;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shankar.hazlecast.model.hrEmployeeDto;
import com.shankar.hazlecast.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path = "/getEmployees")
	public Collection<hrEmployeeDto> getEmployees() {
		
		return employeeService.getAllEmployees();
		
	}
	
	@GetMapping(path = "/hello", produces=MediaType.APPLICATION_JSON_VALUE)
	public String sayHello() {
		return "hello";
	}

}
