package com.iavtar.vpi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iavtar.vpi.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

	

}
