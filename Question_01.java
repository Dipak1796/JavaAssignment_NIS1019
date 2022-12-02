package com.nissan.app;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		//call 
		getUserInformation();

	}

	private static void getUserInformation() {
		
		Scanner scanner=new Scanner(System.in);
		String name=null;
		long contactNo=0;
		int age=0;
		try{
			//input from user
			System.out.println("Enter Name: ");
			name=scanner.next();
			System.out.println("Enter Contact No :");
			contactNo=scanner.nextLong();
			//using loop for age validation
			do{
			
			System.out.println("Enter Age:");
			age=scanner.nextInt();
			
			//validation for age between age 18-60
			if(age>60){
				System.out.println("Age should be less than 60");
				age=scanner.nextInt();
			}else if(age<18){
				System.out.println("Age should be more than 18");
				age=scanner.nextInt();
			}else{
				break;
			}
			
			}while(true);
			
		}catch(Exception e){
			System.out.println("Enter valid information");
		}
		System.out.println("Name       :"+name);
		System.out.println("Contact No :"+contactNo);
		System.out.println("Age        :"+age);
		
		
	}

}
