package com.victorpereira.productcatalog.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victorpereira.productcatalog.model.Product;
import com.victorpereira.productcatalog.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	private ProductRepository repo;
	
	@PostMapping
	Product create(@RequestBody Product product) {
		return repo.save(product);
	}
	
	@GetMapping(value="/{id}")
	Optional<Product> findById(@PathVariable Integer id) {
		return repo.findById(id);
	}
}
