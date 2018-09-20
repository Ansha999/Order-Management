package com.java.walmart.service;

import java.util.List;

import com.java.walmart.entity.Orders;

public interface OrderService {
	public List<Orders> getAllOrders();
	
	public List<Orders> getOrdersByCustomerId(int customerId);
	
	public Orders saveOrder(Orders order);
	
//	public Orders updateOrder(Orders order);
	
	public Orders deleteOrder(Orders order);
	
	
}
