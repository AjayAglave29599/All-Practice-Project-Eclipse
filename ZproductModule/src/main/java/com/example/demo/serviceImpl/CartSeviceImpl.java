//package com.example.demo.serviceImpl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.model.Cart;
//import com.example.demo.model.Product;
//import com.example.demo.repository.CartRepository;
//import com.example.demo.service.CartService;
//
//@Service
//public class CartSeviceImpl implements CartService {
//	
//	
//	@Autowired
//	private CartRepository cartRepository;
//
//	@Override
//	public Cart addProductToCart(Cart cart, Product p, int quantity) {
//		// TODO Auto-generated method stub
//		return cartRepository.save(cart);
//	}
//
//	@Override
//	public List<Cart> viewAllProduct() {
//		// TODO Auto-generated method stub
//		return cartRepository.findAll();
//	}
//
//	@Override
//	public Cart updateProductQuantity(Cart cart, Product p, int quantity) {
//		// TODO Auto-generated method stub
//		return cartRepository.save(cart);
//	}
//
//	@Override
//	public String removeAllproduct(Cart cart) {
//		// TODO Auto-generated method stub
//		cartRepository.delete(cart);
//		return "deleted";
//	}
//
//	@Override
//	public String removeProductFromCart(Cart cart, Product p) {
//		// TODO Auto-generated method stub
//		cartRepository.delete(cart);
//		return "Deleted Successfully";
//	}
//
//}
