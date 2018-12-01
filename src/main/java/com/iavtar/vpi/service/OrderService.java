package com.iavtar.vpi.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.iavtar.vpi.model.Order;
import com.iavtar.vpi.repository.OrderRepository;

public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public void createOrder(Order order) {
		orderRepository.save(order);
	}

}
