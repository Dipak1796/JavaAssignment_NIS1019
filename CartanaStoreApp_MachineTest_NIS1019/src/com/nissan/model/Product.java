package com.nissan.model;

public class Product {
	
	//declare variables as private
	private int itemId;
	private String itemName;
	private double buyingPrice;
	private double sellingPrice;
	private float tax;
	private int quantity;
	private Category category;
	
	//default Constructor
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Parameterized Constructor
	public Product(int itemId, String itemName, double buyingPrice,
			double sellingPrice, float tax, int quantity, Category category) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.buyingPrice = buyingPrice;
		this.sellingPrice = sellingPrice;
		this.tax = tax;
		this.quantity = quantity;
		this.category = category;
	}

	//Getter and Setter method 
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	//toString method
	public String toString() {
		return "Product [itemId=" + itemId + ", itemName=" + itemName
				+ ", buyingPrice=" + buyingPrice + ", sellingPrice="
				+ sellingPrice + ", tax=" + tax + ", quantity=" + quantity
				+ ", category=" + category + "]";
	}
	
	
	
	

}
