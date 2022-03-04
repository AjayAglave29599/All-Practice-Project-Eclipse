package com.example.demo.Entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Long cId;
    private String cName;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(Long cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}
	
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cId, cName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(cId, other.cId) && Objects.equals(cName, other.cName);
	}
    
    
    
	

}
