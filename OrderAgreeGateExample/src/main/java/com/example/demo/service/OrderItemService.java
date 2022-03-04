package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Order;
import com.example.demo.model.OrderItem;


public interface OrderItemService {
	
	public List<OrderItem> listAllOrderItem();
	public OrderItem saveOrderItem(OrderItem orderItem);
	public OrderItem updateOrderItem(OrderItem orderItem);
	public String deleteOrderItem(OrderItem orderItem);


}
