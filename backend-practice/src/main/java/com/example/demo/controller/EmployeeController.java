package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@GetMapping("/employees")
	List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}
	
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee e) {
		return employeeRepo.save(e);
	}
	
//	private EmployeeService employeeService;
//
//	public EmployeeController(EmployeeService employeeService) {
//		super();
//		this.employeeService = employeeService;
//	}
//	
//	// build create employee REST API
//	@PostMapping()
//	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
////		System.out.println(employee.firstName);
//		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
//	}
//	
//	@GetMapping("/empl")
//	public List<Employee> getAllEmployees(){
//		return employeeService.getAllEmployees();
//	}
//	
//	@GetMapping("{id}")
//	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long id){
//		return new ResponseEntity<Employee>(employeeService.getEmployeeById(id),HttpStatus.OK);
//	}
//	
//	@PutMapping("{id}")
//	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id,@RequestBody Employee e){
//		return new ResponseEntity<Employee>(employeeService.updateEmployee(e,id),HttpStatus.OK);
//	}
//	
//	@DeleteMapping("{id}")
//	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
//		employeeService.deleteEmployee(id);
//		return new ResponseEntity<String>("Employee deleted successfully",HttpStatus.OK);
//	}
	
	
}