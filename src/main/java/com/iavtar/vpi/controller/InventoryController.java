package com.iavtar.vpi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.iavtar.vpi.model.ProductCatalog;
import com.iavtar.vpi.service.ProductCatalogService;


/**
 * @author indra
 * */

@Controller
public class InventoryController {

	@Autowired
	private ProductCatalogService productCatalogService;
	
	@GetMapping("/rawInventory")
	public String allProducts(Model model){
		List<ProductCatalog> allProducts = productCatalogService.products();		
		model.addAttribute("products",allProducts);
		return "views/rawInventory";
	}
	
}
