package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OrderItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4630815575964060191L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;
	private String product,quality;
	@OneToOne
	private Order order;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public int hashCode() {
		return Objects.hash(order, orderId, product, quality);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(order, other.order) && Objects.equals(orderId, other.orderId)
				&& Objects.equals(product, other.product) && Objects.equals(quality, other.quality);
	}
	@Override
	public String toString() {
		return "OrderItem [orderId=" + orderId + ", product=" + product + ", quality=" + quality + ", order=" + order
				+ "]";
	}
	
	
}
