package com.nissan.lib;

import java.util.ArrayList;
import java.util.List;
import com.nissan.model.Product;

public class ProductUtility {
	//create collection of Category
	//List<Category> listCategory=new ArrayList<>();
	
	//create collection type list
	public static List<Product> lstProduct=new ArrayList<>();
	
	
	//create add product method
	public static void addProduct(Product product){
		
		try{
			lstProduct.add(product);
			System.out.println("successfully Added");
		}
		catch(Exception e){
			System.out.println("Invalid product");
		}
		
	}
	//get size of list
	public static int getSize(){
		return lstProduct.size();
	}
	//create method for searching product
	public static void searchProduct(int id,String name){
		
		try{
			for(Product item:lstProduct){
				if(item.getItemId()==id||item.getItemName().equalsIgnoreCase(name))
				{
					System.out.println("Name :"+item.getItemName());
					System.out.println("Buying Price:"+item.getBuyingPrice());
					System.out.println("Selling Price:"+item.getSellingPrice());
					System.out.println("Tax :"+item.getTax() );
					System.out.println("Quantity :"+item.getQuantity());
					System.out.println("Category :"+item.getCategory().getCategoryName());
				}else{
					System.out.println("Product not found");
				}
			}
			
		}catch(Exception e){
			System.out.println("Invalid inputs....");
		}
		
		
	}
	//create display method by category name
	public static void display(String categoryName){
		
		try{
			
			System.out.println(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%n","ItemId","ItemName","Quantity","Buying Price","Selling Price","Tax"));
			for(Product item:lstProduct){
				
				if(categoryName.equalsIgnoreCase(item.getCategory().getCategoryName()))
				System.out.println(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%n",item.getItemId(),item.getItemName(),item.getQuantity(),item.getBuyingPrice(),item.getSellingPrice(),item.getTax()));
			}
			
		}catch(Exception e){
			System.out.println("Invalid data...");
		}
		
	}
	//display All method
	public static void displayAll(){
		
try{
			
			System.out.println(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%n","ItemId","ItemName","Quantity","Buying Price","Selling Price","Tax","Category"));
			for(Product item:lstProduct){
				
				System.out.println(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%n",item.getItemId(),item.getItemName(),item.getQuantity(),item.getBuyingPrice(),item.getSellingPrice(),item.getTax(),item.getCategory().getCategoryName()));
			}
			
		}catch(Exception e){
			System.out.println("Invalid data...");
		}
		
	}
	
	//validation of Name and quantity
	
	public static boolean checkQuantity(int qnt){
		if(qnt<=0)
			return false;
		
		return true;
	}
	
	public static boolean checkString(String name){
		
		if(name.length()<2){
			return false;
		}
		
		return true;
	}
	
	

}
