package com.spring.project.repository;

import java.util.List;

import org.hibernate.sql.Delete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.project.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String> {

	//List<Employee> findByName(String email_id);
	
	String deleteByemailId(String email_id);
	
	List<Employee> findByemailId(String email_id);

}