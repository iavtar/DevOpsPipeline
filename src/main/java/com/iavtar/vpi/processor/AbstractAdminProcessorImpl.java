package com.iavtar.vpi.processor;

import java.util.Set;

import com.iavtar.vpi.model.Order;
import com.iavtar.vpi.model.ProductCatalog;

/**
 * @author indra
 * */


public class AbstractAdminProcessorImpl implements AbstractAdminProcessorI{

	@Override
	public void createOrder(ProductCatalog productCatalog_id, String createdBy, String createdDate, Integer order_qty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(Order order_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrder(Order order_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Order> allOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createOrder(ProductCatalog productCatalog_id, Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Order> allActiveOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generateMonthlyReport() {
		// TODO Auto-generated method stub
		
	}

		
	
}
