package com.iavtar.vpi.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author indra
 * */

public class RAWInventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer raw_id;
	private String raw_name;
	private String raw_description;
	private String raw_qty;

	public RAWInventory() {
	}

	public RAWInventory(Integer raw_id, String raw_name, String raw_description) {
		this.raw_id = raw_id;
		this.raw_name = raw_name;
		this.raw_description = raw_description;
	}

	public RAWInventory(String raw_name, String raw_description, String raw_qty) {
		this.raw_name = raw_name;
		this.raw_description = raw_description;
		this.raw_qty = raw_qty;
	}

	public Integer getRaw_id() {
		return raw_id;
	}

	public void setRaw_id(Integer raw_id) {
		this.raw_id = raw_id;
	}

	public String getRaw_name() {
		return raw_name;
	}

	public void setRaw_name(String raw_name) {
		this.raw_name = raw_name;
	}

	public String getRaw_description() {
		return raw_description;
	}

	public void setRaw_description(String raw_description) {
		this.raw_description = raw_description;
	}

	public String getRaw_qty() {
		return raw_qty;
	}

	public void setRaw_qty(String raw_qty) {
		this.raw_qty = raw_qty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((raw_id == null) ? 0 : raw_id.hashCode());
		result = prime * result + ((raw_name == null) ? 0 : raw_name.hashCode());
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
		RAWInventory other = (RAWInventory) obj;
		if (raw_id == null) {
			if (other.raw_id != null)
				return false;
		} else if (!raw_id.equals(other.raw_id))
			return false;
		if (raw_name == null) {
			if (other.raw_name != null)
				return false;
		} else if (!raw_name.equals(other.raw_name))
			return false;
		return true;
	}

}
