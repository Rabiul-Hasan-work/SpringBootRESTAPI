package com.RESTAPI.RESTAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RESTAPI.RESTAPI.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
