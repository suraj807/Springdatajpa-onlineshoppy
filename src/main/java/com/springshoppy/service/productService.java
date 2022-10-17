package com.springshoppy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.springshoppy.model.product;
import com.springshoppy.repository.productRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {
	
	@Autowired
	private productRepository repo;
	
	public List<product> getAllProduct(){
		
		List<product> productList=new ArrayList<>();
		repo.findAll().forEach(productList::add);
		
		return productList;
		
	}
	
	
	public String addProduct(product p1) {
		repo.save(p1);
		
		return "successfully added....";
	}
	
	public Optional<product> getproduct(int id){
		return repo.findById(id);
	}
	

}
