package com.example.demo.Service;

import com.example.demo.model.Cart;
import com.example.demo.model.Product;

public interface CartService {
	
	public Cart addProductToCart(Cart cart,Product product,int quantity);
	public String removeProductFromCart(Cart cart,Product product);
	public Cart updateProductQuantity(Cart cart,Product product,int quantity);
	public String removeAllProduct(Cart cart);
	public Cart viewAllProduct(Cart cart);

}
