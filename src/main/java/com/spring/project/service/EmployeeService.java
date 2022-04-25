package com.spring.project.service;

import java.util.List;

import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
	
	//get by emailId
	public List<Employee> findByName(String emailId) {
		return productRepo.findByemailId(emailId);
	}
	
	//delete by email
	@Transactional
	public String deleteByemailId(String email_id) {
		return productRepo.deleteByemailId(email_id);	
	}

	
	  //update the product 
	public Employee updateProduct(String email_id,Employee product) { 
		Employee prod = productRepo.findById(email_id).orElse(null);
	  //Product prod = productRepo.findById(product.getId()).orElse(null);
	  prod.setName(prod.getName()); 
	  prod.setEmailId(prod.getEmailId());
	  prod.setWorklocation(prod.getWorklocation()); 
	  prod.setAge(prod.getAge());
	  prod.setGender(prod.getGender()); 
	  prod.setDesignation(prod.getDesignation());
	  prod.setDOB(prod.getDOB());
	  
	  
	  return productRepo.save(prod); 
	  }
	 

	

	

	
	
	
	
}