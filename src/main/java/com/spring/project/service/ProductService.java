package com.spring.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.entity.Product;
import com.spring.project.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	
	//create
	public Product saveAll(Product product) {
		return productRepo.save(product);
	}
	
	//get
	public List<Product> findProduts() {
		return productRepo.findAll();
		
	}
	
	//get data by id
	public Product getDataById(int productId) {
		return productRepo.findById(productId).orElse(null);
	}
	//get by Name
	public List<Product> finfByName(String name) {
		return productRepo.findByName(name);
	}
	
	//delete by Id
	public String deleteByName(int id) {
		productRepo.deleteById(id);
		//System.out.println("product removed successufully for id : "+id);
		return "product removed successufully for id : "+id;
	}
	
	//update the product
	public Product updateProduct(int id,Product product) {
		Product prod = productRepo.findById(id).orElse(null);
		//Product prod = productRepo.findById(product.getId()).orElse(null);
		prod.setId(product.getId());
		prod.setCity(product.getCity());
		prod.setName(product.getName());
		prod.setEmailId(product.getEmailId());
		
		return productRepo.save(prod);
	}
}