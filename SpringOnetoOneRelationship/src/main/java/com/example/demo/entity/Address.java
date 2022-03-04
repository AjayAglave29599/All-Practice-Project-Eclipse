package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7101348433998567914L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;
	private String streat,city,pin;
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getStreat() {
		return streat;
	}
	public void setStreat(String streat) {
		this.streat = streat;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addressId, city, pin, streat);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(addressId, other.addressId) && Objects.equals(city, other.city)
				&& Objects.equals(pin, other.pin) && Objects.equals(streat, other.streat);
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", streat=" + streat + ", city=" + city + ", pin=" + pin + "]";
	}
	

}
