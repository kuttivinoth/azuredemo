package com.cbd.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbd.demo.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping("/cbd")
    public List<Employee> getEmployees() 
    {
	    	String prefix = System.getenv().getOrDefault("GREETING_PREFIX", "Hi");
	    	System.out.println("prefix !"+prefix);
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"Harry","kumar2","kuttivinoth@cbd.com"));
		return employeesList;
    }

}
