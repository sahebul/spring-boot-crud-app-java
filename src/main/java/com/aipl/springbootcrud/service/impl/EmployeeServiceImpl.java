package com.aipl.springbootcrud.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aipl.springbootcrud.model.products.Employee;
import com.aipl.springbootcrud.model.products.EmployeeDetails;
import com.aipl.springbootcrud.repository.EmployeeRepository;
import com.aipl.springbootcrud.service.ParsingService;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service  
public class EmployeeServiceImpl {
	
	private Employee employeeData;
	private ArrayList<EmployeeDetails> employeeDetails;
	private static String message="Operation success";
	private static final String url="http://dummy.restapiexample.com/api/v1/employees";
	@Autowired 
	EmployeeRepository employeeRepository;
	@Autowired
	private ParsingService parsingService;
	
	public void saveEmployee(EmployeeDetails emp) {
		employeeRepository.save(emp);
	}
	
	public String fetchData() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			employeeData =mapper.convertValue(parsingService.parse(url), Employee.class);
			employeeDetails=(ArrayList<EmployeeDetails>) employeeData.getData();
			if(employeeData.getStatus().equalsIgnoreCase("success")) {
				if(employeeDetails.size()>0) {
					for(int i=0;i<employeeDetails.size(); i++) {
						if(employeeDetails.get(i) != null) {
							saveEmployee(employeeDetails.get(i));
//							System.out.print(employeeDetails.get(i).getEmployee_name());
						}
						
					}
				}
				
			}else {
				message="No Data Found. Operation failed.";
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			message=e.getMessage();
		}
		return message;
	}

}
