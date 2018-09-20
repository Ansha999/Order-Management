package com.java.walmart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.walmart.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer>{

  List<Orders> findByCustomerCustomerId(int customerId);
 // List<Orders> findByOrderAmount(double orderAmount);
}
