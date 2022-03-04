package com.example.demo.Entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sId;
	private String sName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Long sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	
	public Long getsId() {
		return sId;
	}
	public void setsId(Long sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(sId, sName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(sId, other.sId) && Objects.equals(sName, other.sName);
	}
	
	
	
	
	

}
