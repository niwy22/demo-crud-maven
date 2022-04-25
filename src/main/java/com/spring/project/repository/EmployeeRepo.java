package com.spring.project.repository;

import java.util.List;

import org.hibernate.sql.Delete;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import com.spring.project.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String> {

	
	
	String deleteByemailId(String email_id);
	
	List<Employee> findByemailId(String email_id);
	
	
	

	

}