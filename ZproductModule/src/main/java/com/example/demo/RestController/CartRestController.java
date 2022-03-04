//package com.example.demo.RestController;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.model.Cart;
//import com.example.demo.model.Product;
//import com.example.demo.serviceImpl.CartSeviceImpl;
//
//@RestController
//@RequestMapping("/cart")
//public class CartRestController {
//	
//	@Autowired
//	private CartSeviceImpl cartSeviceImpl;
//	
//	@GetMapping("/")
//	public  List<Cart> display()
//	{
//		return cartSeviceImpl.viewAllProduct();
//	}
//	
//	@PostMapping("/")
//	public Cart add(@RequestBody Cart cart,Product p,int quantity)
//	{
//		return cartSeviceImpl.addProductToCart(cart, p, quantity);
//	}
//	
//	@PutMapping("/")
//	public Cart update(@RequestBody Cart cart,Product p,int quantity)
//	{
//		return cartSeviceImpl.updateProductQuantity(cart,p, quantity);
//	}
//	@DeleteMapping("/")
//	public String delete(@RequestBody Cart cart)
//	{
//		cartSeviceImpl.removeAllproduct(cart);
//		return "Deleted Successfully";
//	}
//	
//	@DeleteMapping("/")
//	public String deleteproduct(@RequestBody Cart cart,Product p)
//	{
//		cartSeviceImpl.removeProductFromCart(cart,p);
//		return "Product Deleted SuccessFully";
//		
//	}
//
//}
