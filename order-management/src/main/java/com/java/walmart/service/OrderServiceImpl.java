package com.java.walmart.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.walmart.entity.OrderItem;
import com.java.walmart.entity.Orders;
import com.java.walmart.repository.OrderItemRepository;
import com.java.walmart.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
   @Autowired	
   private OrderRepository orderRepository;
   
   @Autowired
   private OrderItemRepository orderItemRepository;
   
	public List<Orders> getAllOrders() {
		List<Orders> listOfOrders= new ArrayList<Orders>();
		
		List<Orders> orderList=(List<Orders>) orderRepository.findAll();
		for(Orders order: orderList) {
			List<OrderItem> orderItemList=orderItemRepository.findByOrderOrderId(order.getOrderId());
			System.out.println(orderItemList.size());
			order.setItemsList(orderItemList);
			System.out.println();
			listOfOrders.add(order);
		}
		return listOfOrders;
	}


	
	@Override
	@Transactional
	public Orders saveOrder(Orders order) {
		// TODO Auto-generated method stub
		ArrayList<OrderItem> itemsList=(ArrayList<OrderItem>) order.getItemsList();
		System.out.println(itemsList.size());
		orderRepository.save(order);
		for(OrderItem item: itemsList) {
			System.out.println(item.getPrice());
		//	System.out.println(item.getOrder().getOrderId());
			
			orderItemRepository.save(item);
		}
		
		return null;
	}

	

	@Override
	public Orders deleteOrder(Orders order) {
		// TODO Auto-generated method stub
		orderRepository.delete(order.getOrderId());
		return null;
	}


	@Override
	public List<Orders> getOrdersByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		List<Orders> listOfOrders= new ArrayList<Orders>();
		List<Orders> orderList=(List<Orders>)orderRepository.findByCustomerCustomerId(customerId);
		for(Orders order: orderList) {
			listOfOrders.add(order);
		}
		return listOfOrders;
	}


	
	
	
	
}
