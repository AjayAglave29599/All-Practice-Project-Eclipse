package com.example.demo.Entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tId;
	private String tName;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(Long tId, String tName) {
		super();
		this.tId = tId;
		this.tName = tName;
	}
	
	public Long gettId() {
		return tId;
	}
	public void settId(Long tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tName=" + tName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(tId, tName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(tId, other.tId) && Objects.equals(tName, other.tName);
	}
	
	

}
