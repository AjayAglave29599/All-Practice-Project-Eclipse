package com.example.demo.model;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {

	@Id
	private String categoryId;
	private String categoryName;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(categoryId, categoryName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(categoryId, other.categoryId) && Objects.equals(categoryName, other.categoryName);
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	
	
	
	
	
	
	
}
