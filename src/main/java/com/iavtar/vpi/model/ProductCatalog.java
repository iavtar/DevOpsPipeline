package com.iavtar.vpi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * @author indra
 * */

@Entity
public class ProductCatalog {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer prod_id;
	private String prod_name;
	private String prod_category;
	private String prod_description;
	private String prod_qty;

	public ProductCatalog() {

	}

	public ProductCatalog(Integer prod_id, String prod_name, String prod_category, String prod_description,
			String prod_qty) {
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_category = prod_category;
		this.prod_description = prod_description;
		this.prod_qty = prod_qty;
	}

	public Integer getProd_id() {
		return prod_id;
	}

	public void setProd_id(Integer prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_category() {
		return prod_category;
	}

	public void setProd_category(String prod_category) {
		this.prod_category = prod_category;
	}

	public String getProd_description() {
		return prod_description;
	}

	public void setProd_description(String prod_description) {
		this.prod_description = prod_description;
	}

	public String getProd_qty() {
		return prod_qty;
	}

	public void setProd_qty(String prod_qty) {
		this.prod_qty = prod_qty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prod_id == null) ? 0 : prod_id.hashCode());
		result = prime * result + ((prod_name == null) ? 0 : prod_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductCatalog other = (ProductCatalog) obj;
		if (prod_id == null) {
			if (other.prod_id != null)
				return false;
		} else if (!prod_id.equals(other.prod_id))
			return false;
		if (prod_name == null) {
			if (other.prod_name != null)
				return false;
		} else if (!prod_name.equals(other.prod_name))
			return false;
		return true;
	}

	

	
}
