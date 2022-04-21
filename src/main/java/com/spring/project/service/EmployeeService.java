package com.spring.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.entity.Employee;
import com.spring.project.repository.EmployeeRepo;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo productRepo;
	
	
	//create
	public Employee saveAll(Employee product) {
		return productRepo.save(product);
	}
	
	//get
	public List<Employee> findProduts() {
		return productRepo.findAll();
		
	}
	
	//get data by id
	public Employee getDataById(int productId) {
		return productRepo.findById(productId).orElse(null);
	}
	//get by Name
	public List<Employee> finfByName(String name) {
		return productRepo.findByName(name);
	}
	
	//delete by Id
	public String deleteByName(int id) {
		productRepo.deleteById(id);
		//System.out.println("product removed successufully for id : "+id);
		return "Employee details removed successufully for id : "+id;
	}
	
	
}