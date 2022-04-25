package com.spring.project.controller;

import java.util.List;

import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/getEmployeeByemailId/{email_id}")
	public List<Employee> getProductByName(@PathVariable("email_id")String emailId) {
		return productService.findByName(emailId);
		
	}
	
	@DeleteMapping("/deleteEmployeeByemailId/{email_id}")
	public String deleteById(@PathVariable("email_id") String  email_id) {
		return productService.deleteByemailId(email_id);
	}
	
	
	  @PutMapping("/updateEmployeeByemailId/{email_id}") 
	  public Employee updateProd(@PathVariable("email_id") String email_id, @RequestBody Employee
	  prod)
	  { return productService.updateProduct(email_id, prod); }
	 
}
