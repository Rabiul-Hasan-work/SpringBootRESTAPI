package com.RESTAPI.RESTAPI.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RESTAPI.RESTAPI.model.Product;
import com.RESTAPI.RESTAPI.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository prepo;
	
	public List<Product> listAll() {
		return prepo.findAll();
	}
	
	public void save(Product product) {
		prepo.save(product);
	}
	
	public Product get(Integer id) {
		return prepo.findById(id).get();
	}
	
	public void delete(Integer id) {
		prepo.deleteById(id);
	}

}
