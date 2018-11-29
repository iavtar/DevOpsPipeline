package com.iavtar.vpi.service;

import java.util.List;

import com.iavtar.vpi.model.Product;


public interface ProductService {

	void saveProduct(Product product);

	List<Product> products();

}
