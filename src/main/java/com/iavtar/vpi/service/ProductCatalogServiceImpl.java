package com.iavtar.vpi.service;

import java.util.List;

import com.iavtar.vpi.model.ProductCatalog;
import com.iavtar.vpi.repository.ProductCatalogRepository;

/**
 * @author indra
 */

public class ProductCatalogServiceImpl implements ProductCatalogService {

	private ProductCatalogRepository productCatalogRepository;

	public ProductCatalogServiceImpl(ProductCatalogRepository productCatalogRepository) {
		this.productCatalogRepository = productCatalogRepository;
	}

	public void saveProduct(ProductCatalog productCatalog) {

		productCatalogRepository.save(productCatalog);

	}

	public List<ProductCatalog> products() {
		List<ProductCatalog> products = (List<ProductCatalog>) productCatalogRepository.findAll();
		return products;
	}

	@Override
	public ProductCatalog getProductId(Integer productCatalog_id) {

		return productCatalogRepository.findOne(productCatalog_id);
	}

}
