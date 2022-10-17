package com.springshoppy.controller;

import java.util.List;
import java.util.Optional;

import com.springshoppy.model.product;
import com.springshoppy.service.productService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

	@Autowired
	private productService service;
	
	@RequestMapping(method=RequestMethod.GET,value="/products")
	public List<product> getAllProducts(){
		return service.getAllProduct();
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/products")
	public void addproduct(@RequestBody product p1) {
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/product/{id}")
	public Optional<product> getproduct(@PathVariable int id){
		return service.getproduct(id);
		
	}
}
