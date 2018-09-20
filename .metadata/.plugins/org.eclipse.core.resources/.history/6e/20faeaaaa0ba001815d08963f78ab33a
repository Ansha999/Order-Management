package com.java.walmart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.walmart.entity.Order;
import com.java.walmart.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
   @Autowired	
   private OrderRepository orderRepository;
   
	public List<Order> getAllOrders() {
		List<Order> listOfOrders= new ArrayList<Order>();
		
		List<Order> orderList=(List<Order>) orderRepository.findAll();
		for(Order order: orderList) {
			listOfOrders.add(order);
		}
		return listOfOrders;
	}
	
	
	
}
