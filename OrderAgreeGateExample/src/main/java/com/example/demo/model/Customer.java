package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.criteria.Order;
@Entity
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6844500373746406603L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;
	private String cName,cEmail;
	
	@OneToMany(mappedBy = "customer",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Order order;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cEmail, cName, customerId, order);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(cEmail, other.cEmail) && Objects.equals(cName, other.cName)
				&& Objects.equals(customerId, other.customerId) && Objects.equals(order, other.order);
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", cName=" + cName + ", cEmail=" + cEmail + ", order=" + order
				+ "]";
	}
}