package com.iavtar.vpi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iavtar.vpi.model.Order;

/**
 * @author indra
 * */


public interface OrderRepository extends JpaRepository<Order, Integer>{

}
