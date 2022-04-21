package com.spring.project.controller;

import java.util.List;

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
	
	@GetMapping("/getEmployeeById")
	public Employee getProductById(@RequestParam int EmployeeId) {
		return productService.getDataById(EmployeeId);
		
	}
	
	@DeleteMapping("/deleteEmployeeById")
	public String deleteById(@RequestParam int id) {
		return productService.deleteByName(id);
	}
	/*
	 * @PutMapping("/updateEmployee") public Employee updateProd(@RequestParam int
	 * employeeId, @RequestBody Employee prod) { return
	 * productService.updateProduct(employeeId, prod); }
	 */
	
	}
