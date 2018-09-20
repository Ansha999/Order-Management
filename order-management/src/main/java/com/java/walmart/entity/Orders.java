package com.java.walmart.entity;




import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
@Entity
public class Orders {

	@Id
	private int orderId;
	
	private Date orderdate;
	
	private double orderAmount;

	private String status ;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Customer customer;
	
	/*@OneToMany(cascade = CascadeType.PERSIST)
	private OrderItem item;
	
	public OrderItem getItem() {
		return item;
	}
	public void setItem(OrderItem item) {
		this.item = item;
	}*/
	//@OneToMany(cascade = CascadeType.PERSIST)
	@Transient
	private List<OrderItem> itemsList;
	
	public List<OrderItem> getItemsList() {
		return itemsList;
	}
	public void setItemsList(List<OrderItem> itemsList) {
		this.itemsList = itemsList;
	}
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}