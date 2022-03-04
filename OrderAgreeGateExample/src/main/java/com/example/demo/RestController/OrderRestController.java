package com.example.demo.RestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.serviceImp.OrderServiceImp;

@RestController
@RequestMapping("/order")
public class OrderRestController {
	
	@Autowired
	public OrderServiceImp orderServiceImp;
	
	@GetMapping("/")
	public List<Order> getOrder()
	{
		return orderServiceImp.listAllOrder();
	}
	
	@PostMapping("/")
	public Order storeOrder(@RequestBody Order order)
	{
		return orderServiceImp.saveOrder(order);
	}
	
	@PutMapping("/")
	public Order updateOrder(@RequestBody Order order)
	{
		return orderServiceImp.updateOrder(order);
	}
	
	@DeleteMapping("/")
	public String deleteOrder(@RequestBody Order order)
	{
		orderServiceImp.deleteOrder(order);
		return "delete Successfully";
		
	}
	
}
