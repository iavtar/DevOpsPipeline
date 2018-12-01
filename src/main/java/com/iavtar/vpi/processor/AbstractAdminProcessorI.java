package com.iavtar.vpi.processor;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.iavtar.vpi.model.Order;
import com.iavtar.vpi.model.ProductCatalog;

/**
 * @author indra
 * */


@Component
public interface AbstractAdminProcessorI {

	void createOrder(ProductCatalog productCatalog_id, String createdBy, String createdDate, Integer order_qty);
	void deleteOrder(Order order_id);
	void updateOrder(Order order_id);
	Set <Order> allOrders();
	void createOrder(ProductCatalog productCatalog_id, Order order);
	Set <Order> allActiveOrders();
	void generateMonthlyReport();
	
}
