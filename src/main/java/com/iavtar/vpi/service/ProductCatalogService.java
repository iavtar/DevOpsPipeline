package com.iavtar.vpi.service;

import java.util.List;

import com.iavtar.vpi.model.ProductCatalog;


/**
 * @author indra
 * */

public interface ProductCatalogService {

	void saveProduct(ProductCatalog productCatalog);

	List<ProductCatalog> products();

	ProductCatalog getProductId(Integer productCatalog_id);

}
