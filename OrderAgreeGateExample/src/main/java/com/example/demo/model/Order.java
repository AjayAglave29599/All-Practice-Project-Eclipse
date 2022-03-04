package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6563433045592906518L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;
   private String totalPrice,created,status,shipmentAddress,shipmentDate;
   @OneToOne(cascade = CascadeType.ALL)
   @ManyToOne(fetch = FetchType.LAZY, optional = false)
   private OrderItem  orderItem;
public Long getOrderId() {
	return orderId;
}
public void setOrderId(Long orderId) {
	this.orderId = orderId;
}
public String getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(String totalPrice) {
	this.totalPrice = totalPrice;
}
public String getCreated() {
	return created;
}
public void setCreated(String created) {
	this.created = created;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getShipmentAddress() {
	return shipmentAddress;
}
public void setShipmentAddress(String shipmentAddress) {
	this.shipmentAddress = shipmentAddress;
}
public String getShipmentDate() {
	return shipmentDate;
}
public void setShipmentDate(String shipmentDate) {
	this.shipmentDate = shipmentDate;
}
public OrderItem getOrderItem() {
	return orderItem;
}
public void setOrderItem(OrderItem orderItem) {
	this.orderItem = orderItem;
}
@Override
public int hashCode() {
	return Objects.hash(created, orderId, orderItem, shipmentAddress, shipmentDate, status, totalPrice);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Order other = (Order) obj;
	return Objects.equals(created, other.created) && Objects.equals(orderId, other.orderId)
			&& Objects.equals(orderItem, other.orderItem) && Objects.equals(shipmentAddress, other.shipmentAddress)
			&& Objects.equals(shipmentDate, other.shipmentDate) && Objects.equals(status, other.status)
			&& Objects.equals(totalPrice, other.totalPrice);
}
@Override
public String toString() {
	return "Order [orderId=" + orderId + ", totalPrice=" + totalPrice + ", created=" + created + ", status=" + status
			+ ", shipmentAddress=" + shipmentAddress + ", shipmentDate=" + shipmentDate + ", orderItem=" + orderItem
			+ "]";
}
   
   

}
