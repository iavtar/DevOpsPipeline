package com.iavtar.vpi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iavtar.vpi.model.ProductCatalog;


/**
 * @author indra
 * */

@Repository
public interface ProductCatalogRepository extends CrudRepository<ProductCatalog, Integer>{

	

}
