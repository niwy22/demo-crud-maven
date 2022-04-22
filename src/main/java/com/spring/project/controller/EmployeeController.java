package com.spring.project.controller;

import java.util.List;

import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.entity.Employee;
import com.spring.project.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService productService;

	@PostMapping("/AddEmployeeDetails")
	public Employee save(@RequestBody Employee product) {
		return productService.saveAll(product);
	}
	
	@GetMapping("/getEmployeeByemailId")
	public List<Employee> getProductByName(@RequestParam String emailId) {
		return productService.findByName(emailId);
		
	}
	
	@DeleteMapping("/deleteEmployeeByemailId")
	public String deleteById(@RequestParam String  email_id) {
		return productService.deleteByemailId(email_id);
	}
	/*
	 * @PutMapping("/updateEmployee") public Employee updateProd(@RequestParam int
	 * employeeId, @RequestBody Employee prod) { return
	 * productService.updateProduct(employeeId, prod); }
	 */
	
	}
