package com.aipl.springbootcrud.controller;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  

import com.aipl.springbootcrud.service.impl.EmployeeServiceImpl;
//import com.aipl.springbootcrud.controller.RESTEmployeeReader;
@RestController  
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	@RequestMapping(value = "/list")
	public String getEmployeeList() {
		return employeeServiceImpl.fetchData();
	   } 
	
}
