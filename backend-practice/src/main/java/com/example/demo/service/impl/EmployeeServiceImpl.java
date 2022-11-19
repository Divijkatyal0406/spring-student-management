package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepo employeeRepo;
	
	public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
//		Optional<Employee> e=employeeRepo.findById(id);
//		if(e.isPresent()) {
//			return e.get(); 
//		}
//		else {
//			throw new ResourceNotFoundException("Employee", "ID", id);
//		}
		
		return employeeRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "ID", id));
	}

	@Override
	public Employee updateEmployee(Employee e,long id) {
		Employee existing=employeeRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "ID", id));
		
		existing.setFirstName(e.getFirstName());
		existing.setLastName(e.getLastName());
		existing.setEmailId(e.getEmailId());
		employeeRepo.save(existing);
		return existing;
	}

	@Override
	public void deleteEmployee(long id) {
		employeeRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "ID", id));
		employeeRepo.deleteById(id);
	}
	
	
}