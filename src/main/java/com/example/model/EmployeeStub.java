package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStub {
	
	public static List<Employee> findAll(){
		List<Employee> list = new ArrayList<Employee>();
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstName("Juan");
		emp.setLastName("Pérez");
		emp.setCompany("Accenture");
		emp.setDepartment("Technology");
		emp.setRole("Developer");
		emp.setLevel(10);
		emp.setSalary(20000);
		list.add(emp);
		
		emp = new Employee();
		emp.setId(2);
		emp.setFirstName("John");
		emp.setLastName("Smith");
		emp.setCompany("Accenture");
		emp.setDepartment("Digital");
		emp.setRole("Manager");
		emp.setLevel(8);
		emp.setSalary(40000);
		list.add(emp);
		
		emp = new Employee();
		emp.setId(3);
		emp.setFirstName("Till");
		emp.setLastName("Lindemman");
		emp.setCompany("Accenture");
		emp.setDepartment("Technology");
		emp.setRole("Architect");
		emp.setLevel(9);
		emp.setSalary(30000);
		list.add(emp);
		
		return list;
	}
	
	public static Employee findOne(long id) {
		Employee emp = new Employee();
		List<Employee> list = findAll();
		for (Employee employee : list) {
			if (employee.getId()==id) {
				emp = employee;
			}
		}
		return emp;
	}
	

}
