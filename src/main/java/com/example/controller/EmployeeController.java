package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.model.EmployeeStub;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	@RequestMapping("employees")
	public List<Employee> getEmployees() {
		return EmployeeStub.findAll();
	}
	
	@RequestMapping("employees/{id}")
	public Employee getEmployee(@PathVariable long id) {
		return EmployeeStub.findOne(id);
	}
	
}
