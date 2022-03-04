package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.OrderRepository;
import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

@Service
public class OrderServiceImp  implements OrderService{

	
	@Autowired
	public OrderRepository orderRepository;
	@Override
	public List<Order> listAllOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public String deleteOrder(Order order) {
		// TODO Auto-generated method stub
		orderRepository.delete(order);
		return "Deleted Successrully";
	}

}
