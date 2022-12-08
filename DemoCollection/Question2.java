package com.nissan.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question2 {
	/*
	 * 2. Develop an application to implement a phone book. 
	 * There should be provision to add,
		delete and search phone numbers. The entries should in sorted order.
	 */
	//Arraylist to store phone numbers
	public static ArrayList<String> listPhoneNumber=new ArrayList<String>();
	//for input
	public static Scanner scanner=new Scanner(System.in);
	//main function: inputs
	public static void main(String[] args)
	{
		char choice='n';
		do{
			try{
				System.out.println("Hello there!!! Please select appropriate option");
				System.out.println("1.Add phone number \n2.Delete phone number \n3.Search phone number");
				int option=scanner.nextInt();
				switch (option)
				{
					case 1:
						addPhoneNumber();
						break;
					case 2:
						deletePhoneNumber();
						break;
					case 3:
						searchPhoneNumber();
						break;
					default:
						System.out.println("Choose appropriate option..Please try Again");
						
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Invalid Entry.....");
			}
			finally
			{
				displayList();
			}
			System.out.println("Do you want to enter more(y/n): ");
			choice=scanner.next().charAt(0);
			
		}while(choice=='y'||choice=='Y');
		
	}
	//Search functionality
	private static void searchPhoneNumber() {
		System.out.println("Please enter the phone number to be searched: ");
		String number=scanner.next();
		if(listPhoneNumber.contains(number))
		{
			System.out.println("Number already exists!!! "+number);
		}
		else
		{
			System.out.println("Number not found!!! Please add it.");
		}
		
	}
	//Display list in sorted manner
	private static void displayList() {
		int i=1;
		Collections.sort(listPhoneNumber);
		System.out.println("Phone Number List: ");
		System.out.println("----------------------------------------------");
		for(String numbers:listPhoneNumber)
		{
			System.out.println(i+" "+numbers);
			i++;
		}
		System.out.println("----------------------------------------------");
		
	}
	//Delete the phone number
	private static void deletePhoneNumber() {
		System.out.println("Please enter the phone number to be deleted: ");
		String number=scanner.next();
		listPhoneNumber.remove(number);	
	}
	//add Phone Number to list
	private static void addPhoneNumber() {
		System.out.println("Please enter phone number to add: ");
		String number=scanner.next();
		listPhoneNumber.add(number);
	}
} 
