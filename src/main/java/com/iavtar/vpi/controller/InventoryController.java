package com.iavtar.vpi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.iavtar.vpi.model.Product;
import com.iavtar.vpi.service.ProductService;

@Controller
public class InventoryController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/rawInventory")
	public String allProducts(Model model){
		List<Product> allProducts = productService.products();		
		model.addAttribute("products",allProducts);
		return "views/rawInventory";
	}
	
}
