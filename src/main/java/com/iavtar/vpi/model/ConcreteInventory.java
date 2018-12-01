package com.iavtar.vpi.model;


/**
 * @author indra
 * */

public class ConcreteInventory {

	private Integer conc_id;
	private String con_name;
	private String con_qty;
	private String con_description;
	
	public ConcreteInventory(Integer conc_id, String con_name, String con_qty, String con_description) {
		this.conc_id = conc_id;
		this.con_name = con_name;
		this.con_qty = con_qty;
		this.con_description = con_description;
	}

	public ConcreteInventory(String con_name, String con_qty, String con_description) {
		this.con_name = con_name;
		this.con_qty = con_qty;
		this.con_description = con_description;
	}

	public Integer getConc_id() {
		return conc_id;
	}

	public void setConc_id(Integer conc_id) {
		this.conc_id = conc_id;
	}

	public String getCon_name() {
		return con_name;
	}

	public void setCon_name(String con_name) {
		this.con_name = con_name;
	}

	public String getCon_qty() {
		return con_qty;
	}

	public void setCon_qty(String con_qty) {
		this.con_qty = con_qty;
	}

	public String getCon_description() {
		return con_description;
	}

	public void setCon_description(String con_description) {
		this.con_description = con_description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((con_name == null) ? 0 : con_name.hashCode());
		result = prime * result + ((conc_id == null) ? 0 : conc_id.hashCode());
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
		ConcreteInventory other = (ConcreteInventory) obj;
		if (con_name == null) {
			if (other.con_name != null)
				return false;
		} else if (!con_name.equals(other.con_name))
			return false;
		if (conc_id == null) {
			if (other.conc_id != null)
				return false;
		} else if (!conc_id.equals(other.conc_id))
			return false;
		return true;
	}
	
	
	
	
}
