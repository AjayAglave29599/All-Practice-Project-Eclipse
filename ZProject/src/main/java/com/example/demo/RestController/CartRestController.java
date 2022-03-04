package com.example.demo.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImpl.CartServiceImpl;
import com.example.demo.model.Cart;
import com.example.demo.model.Product;

@RestController
@RequestMapping("/cart")
public class CartRestController {
	
	@Autowired
	private CartServiceImpl cartServiceImpl;
	
	@GetMapping("/")
	public  Cart display(@RequestBody Cart cart)
	{
		return cartServiceImpl.viewAllProduct(cart);
	}
	
	@PostMapping("/")
	public Cart addProduct(@RequestBody Cart cart,Product product,int quantity)
	{
		return cartServiceImpl.addProductToCart(cart, product, quantity);
		
	}
	
	@PutMapping("/")
	public Cart update(@RequestBody Cart cart,Product product,int quantity)
	{
		return  cartServiceImpl.updateProductQuantity(cart, product, quantity);
	}
	
	
	@DeleteMapping("/c")
	public String deleteProductFromCart(@RequestBody Cart cart, Product product)
	{
		cartServiceImpl.removeProductFromCart(cart, product);
		return "deleted from Cart";
	}
	@DeleteMapping("/")
	public String delete(@RequestBody Cart cart)
	{
		cartServiceImpl.removeAllProduct(cart);
		return "Deleted Successfully";
	}

	

}
