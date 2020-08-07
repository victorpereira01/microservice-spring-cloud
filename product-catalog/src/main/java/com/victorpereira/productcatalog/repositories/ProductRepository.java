package com.victorpereira.productcatalog.repositories;

import org.springframework.data.repository.CrudRepository;

import com.victorpereira.productcatalog.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
