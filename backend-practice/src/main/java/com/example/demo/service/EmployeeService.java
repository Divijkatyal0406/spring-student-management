package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;



public interface EmployeeService {
	Employee saveEmployee(Employee e);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee e,long id);
	void deleteEmployee(long id);
}
