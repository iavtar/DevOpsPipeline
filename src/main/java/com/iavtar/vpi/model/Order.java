package com.iavtar.vpi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author indra
 * */



@Entity
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer order_id;
	private String order_createdby;
	private String order_details;
	private String productFor;
	private Date productOrderDate;

	public Order() {
	}

	public Order(Integer order_id, String order_createdby, String order_details, String productFor,
			Date productOrderDate) {
		this.order_id = order_id;
		this.order_createdby = order_createdby;
		this.order_details = order_details;
		this.productFor = productFor;
		this.productOrderDate = productOrderDate;
	}

	public Order(String order_createdby, String order_details, String productFor, Date productOrderDate) {
		this.order_createdby = order_createdby;
		this.order_details = order_details;
		this.productFor = productFor;
		this.productOrderDate = productOrderDate;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public String getOrder_createdby() {
		return order_createdby;
	}

	public void setOrder_createdby(String order_createdby) {
		this.order_createdby = order_createdby;
	}

	public String getOrder_details() {
		return order_details;
	}

	public void setOrder_details(String order_details) {
		this.order_details = order_details;
	}

	public String getProductFor() {
		return productFor;
	}

	public void setProductFor(String productFor) {
		this.productFor = productFor;
	}

	public Date getProductOrderDate() {
		return productOrderDate;
	}

	public void setProductOrderDate(Date productOrderDate) {
		this.productOrderDate = productOrderDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
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
		Order other = (Order) obj;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		return true;
	}

}
