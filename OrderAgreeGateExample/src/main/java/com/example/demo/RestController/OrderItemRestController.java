package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderItem;
import com.example.demo.serviceImp.OrderItemServiceImp;

@RestController
@RequestMapping("/orderitem")
public class OrderItemRestController  {
	@Autowired
	public OrderItemServiceImp orderItemServiceImp;
	
	@GetMapping("/")
	public List<OrderItem> listAllOrderItem()
	{
	  return orderItemServiceImp.listAllOrderItem() ;
	}
	
	@PostMapping("/")
	public OrderItem storeOrderItem(@RequestBody OrderItem orderItem)
	{
		return orderItemServiceImp.saveOrderItem(orderItem);
	}
	
	@PutMapping("/")
	public OrderItem updateOrderItem(@RequestBody OrderItem orderItem)
	{
		return orderItemServiceImp.updateOrderItem(orderItem);
	}
	
	public String deleteOrderItem(@RequestBody OrderItem orderItem)
	{
		orderItemServiceImp.deleteOrderItem(orderItem);
		return "delete Successfully";
	}
	
	

}
