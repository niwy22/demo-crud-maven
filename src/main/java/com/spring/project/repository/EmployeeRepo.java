package com.spring.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	List<Employee> findByName(String name);

}