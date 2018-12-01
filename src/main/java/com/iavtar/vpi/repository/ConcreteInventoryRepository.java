package com.iavtar.vpi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iavtar.vpi.model.ConcreteInventory;


/**
 * @author indra
 * */

public interface ConcreteInventoryRepository extends JpaRepository<ConcreteInventory, Integer>{

}
