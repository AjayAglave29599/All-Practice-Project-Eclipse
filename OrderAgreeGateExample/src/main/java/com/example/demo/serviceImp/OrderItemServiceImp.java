package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.OrderItemRepository;
import com.example.demo.model.OrderItem;
import com.example.demo.service.OrderItemService;
@Service
public class OrderItemServiceImp implements OrderItemService {
	
	
	@Autowired
	public OrderItemRepository orderItemRepository;

	@Override
	public List<OrderItem> listAllOrderItem() {
		// TODO Auto-generated method stub
		return orderItemRepository.findAll();
	}

	@Override
	public OrderItem saveOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return orderItemRepository.save(orderItem);
	}

	@Override
	public OrderItem updateOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return orderItemRepository.save(orderItem);
	}

	@Override
	public String deleteOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		orderItemRepository.delete(orderItem);
		return "deleted Successfully";
	}

}
