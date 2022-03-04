package com.example.demo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pId;
	private String name,address,phone;
	
	public Person(Long pId, String name, String address, String phone) {
		super();
		this.pId = pId;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, name, pId, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name)
				&& Objects.equals(pId, other.pId) && Objects.equals(phone, other.phone);
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	

}
