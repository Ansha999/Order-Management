package com.java.walmart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@Column(name="customerId", nullable=false, updatable=false, insertable=true)
	private int customerId;
	private String customerName ;
	private boolean active_ind;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public boolean isActive_ind() {
		return active_ind;
	}
	public void setActive_ind(boolean active_ind) {
		this.active_ind = active_ind;
	}
	
	
}
