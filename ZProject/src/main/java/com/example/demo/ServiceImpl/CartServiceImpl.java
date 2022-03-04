package com.example.demo.ServiceImpl;


import org.springframework.stereotype.Service;

import com.example.demo.Repository.CartRepository;
import com.example.demo.Service.CartService;
import com.example.demo.model.Cart;
import com.example.demo.model.Product;

@Service
public class CartServiceImpl implements CartService {
	
	private CartRepository cartRepository;

	@Override
	public Cart viewAllProduct(Cart cart) {
		// TODO Auto-generated method stub
		return cartRepository.save(cart);
	}
	
	@Override
	public Cart addProductToCart(Cart cart, Product product,int quantity) {
		return cartRepository.save(cart);
	}

	@Override
	public Cart updateProductQuantity(Cart cart, Product product, int quantity) {
		// TODO Auto-generated method stub
		return cartRepository.save(cart);
	}

	@Override
	public String removeProductFromCart(Cart cart, Product product) {
		// TODO Auto-generated method stub
		cartRepository.delete(cart);
		return "deleted";
	}

	
	@Override
	public String removeAllProduct(Cart cart) {
		// TODO Auto-generated method stub
		cartRepository.delete(cart);
		return "deleted";
	}

	}
