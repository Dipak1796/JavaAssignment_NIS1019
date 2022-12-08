package com.nissan.model;

public class Category {
	//declare variable as private
	private int categoryId;
	private String categoryName;
	
	//default constructor
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized constructor
	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}


	//getter & setter methods
	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	//toString method 
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName="
				+ categoryName + "]";
	}
	
	
	
	
	
	

}
