package com.nissan.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nissan.lib.ProductUtility;
import com.nissan.model.Category;
import com.nissan.model.Product;

public class DemoCartanaApp {

	public static void main(String[] args) {
	
		
		Scanner scanner=new Scanner(System.in);//for except String datatype
		Scanner scanner2=new Scanner(System.in);//for String only
		//Created category for user
		List<Category> lstCtg=new ArrayList<>();
		//added some category
		lstCtg.add(new Category(1,"Camera"));
		lstCtg.add(new Category(2,"Laptop"));
		lstCtg.add(new Category(3,"Mobile"));
		lstCtg.add(new Category(4,"Watch"));
		
		//char choice='n';
		int ch=0;
		
		//Use try Catch block for handling Exception
		try{
		
		//use do while loop for menu repetition
		do{
			//Menu for user
			System.out.println("1.Add Product");
			System.out.println("2.Add Category");
			System.out.println("3.Search Product");
			System.out.println("4.Display by category");
			System.out.println("5.Display All");
			System.out.println("6.Exit");
			System.out.println("=============================");
			System.out.println("Enter your choice :");
		    ch=scanner.nextInt();
			switch(ch){
			//Add Product 
			case 1 :
				int id=ProductUtility.getSize()+1;
				System.out.println("Enter Item Name");
				String name=scanner2.nextLine();
				//String length validation
				if(!ProductUtility.checkString(name)){
					System.out.println("Please Enter more character in Name");
					name=scanner2.nextLine();
				}
				System.out.println("Enter Item buying price");
				double buyPrice=scanner.nextDouble();
				System.out.println("Enter Item Selling price");
				double sellPrice=scanner.nextDouble();
				System.out.println("Enter tax on item");
				float tax=scanner.nextFloat();
				System.out.println("Enter quantity of product");
				int qnt=scanner.nextInt();
				//check quantity validation
				if(!ProductUtility.checkQuantity(qnt))
				{
					System.out.println("Please Enter more than 0 Quantity");
					qnt=scanner.nextInt();
				}
				System.out.println("Select Category Of Product\n\n");
				System.out.println(String.format("%20s%20s%n","Category Id","Category Name"));
				//Showing category list to user
			    for(Category ctg:lstCtg){
			    	System.out.println(String.format("%20s%20s%n",ctg.getCategoryId(),ctg.getCategoryName()));
			    }
			    System.out.println("Enter Category Id");
			    Category category=lstCtg.get(scanner.nextInt()-1);
			    
			    Product p=new Product(id,name,buyPrice,sellPrice,tax,qnt,category);
			    ProductUtility.addProduct(p);
			    break;
			//Add Category    
			case 2:
				
				int catId=lstCtg.size()+1;
				System.out.println("Enter Category Name");
				String catName=scanner2.nextLine();
				lstCtg.add(new Category(catId,catName));
				break;
			//Searching Method	
			case 3:
				System.out.println("Enter Item id");
				int itemId=scanner.nextInt();
				System.out.println("Enter Product Name");
				String itemName=scanner2.nextLine();
				if(!ProductUtility.checkString(itemName)){
					System.out.println("Plese Enter more character in String..");
					itemName=scanner2.nextLine();
				}
				ProductUtility.searchProduct(itemId, itemName);
				break;
			//Display method using category	
			case 4:
				System.out.println("Enter category name");
				String ctgName=scanner2.nextLine();
				//String length validation
				if(!ProductUtility.checkString(ctgName)){
					System.out.println("Please Enter more character in Name");
					ctgName=scanner2.nextLine();
				}
				ProductUtility.display(ctgName);
				break;
			//display all
			case 5:
				ProductUtility.displayAll();
				break;
		    //exit menu driven
			case 6:
				System.out.println("Successfully Exit");
				break;
			//default for invalid choice
			default :
				System.out.println("Invalid Choice");
				break;
			}	
			
		}while(ch!=6);
		}catch(Exception e){
			System.out.println("Invalid datatype..");
		}
		
		scanner2.close();
		
		
		scanner.close();

	}

}
