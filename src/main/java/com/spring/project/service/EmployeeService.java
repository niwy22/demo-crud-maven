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
	
	/*
	 * //delete by Id public String deleteByName(int id) {
	 * productRepo.deleteById(id);
	 * //System.out.println("product removed successufully for id : "+id); return
	 * "Employee details removed successufully for id : "+id; }
	 */
	
	//delete by email
	@Transactional
	public String deleteByemailId(String email_id) {
		//return "Employee details removed successufully for id : "+email_id;
		//System.out.println("Employee removed successufully for email_id : "+email_id);
		return productRepo.deleteByemailId(email_id);
		
		//String emailId = productRepo.deleteByemailId(String email_id);
		
	}
	
	
	
}