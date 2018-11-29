package com.iavtar.vpi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iavtar.vpi.model.Product;
import com.iavtar.vpi.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public void saveProduct(Product product) {

		productRepository.save(product);

	}

	public List<Product> products() {
		List<Product> products = (List<Product>) productRepository.findAll();
		return products;
	}

}
