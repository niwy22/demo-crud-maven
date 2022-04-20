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

import com.spring.project.entity.Product;
import com.spring.project.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping("/AddEmployeeDetails")
	public Product save(@RequestBody Product product) {
		return productService.saveAll(product);
	}
	
	@GetMapping("/getEmployeeById")
	public Product getProductById(@RequestParam int prodId) {
		return productService.getDataById(prodId);
		
	}		
	
	@DeleteMapping("/deleteEmployeeById")
	public String deleteById(@RequestParam int id) {
		return productService.deleteByName(id);
	}
	
	}
