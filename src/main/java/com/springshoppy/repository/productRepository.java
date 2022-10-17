package com.springshoppy.repository;

import com.springshoppy.model.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface productRepository  extends JpaRepository<product,Integer>{

}
