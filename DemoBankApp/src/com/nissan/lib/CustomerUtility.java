package com.nissan.lib;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerUtility {

	//Step 1: Get Input from User       
	
	public static void getInputFromUser(){
		//Declare variables
		Scanner input=new Scanner(System.in);
		
		//Storing data : array ---->name and balance
		String [] customerNames=new String[5];
		double[] accountBalances =new double[5];
		Date arrDoj[] =new Date[5];
		
		//menu driven
		char choice='n';
		int i=0;
		
		try{
			do{
				System.out.println("Enter Customer name :");
				//String temp=input.nextLine();
				
				//set the validation
				String temp=setValidCustomerName(input.nextLine());
				//System.out.println(temp);
				
				
				//check duplication
				if(checkCustomerNameExits(temp,customerNames)){
					System.out.println("Customer name existing try with another");
					continue;
				}
				else{
					customerNames[i]=temp;
					
				}
				//Account Balance
				System.out.println("Enter your balance");
				//double balance=setValidBalance(input.nextLine());
				//System.out.println("Balance :"+balance);
				accountBalances[i]=setAccountBalance(Double.parseDouble(input.nextLine()));
				
				//Date of Join
				
				System.out.println("Enter the join date(dd/mm/yyyy)");
				String joinDate=input.nextLine();//14/11/2022
				
				arrDoj[i]=convertStringToDate(joinDate);
				
				//increment..
				i++;
				//continue..
				System.out.println("Do you want to continue...");
				choice=input.nextLine().charAt(0);
				
			}while(choice=='y'||choice=='Y');
			
		}catch(Exception e)
		{
			System.out.println("Invalid process....");
		}
		finally{
			displayOutPut(customerNames,accountBalances,arrDoj);
		}
	}
	
	   
	

	private static Date convertStringToDate(String joinDate) throws ParseException {


		//java.util.Date format is dd/MM/yyyy--->SimpleDateFormat
		//Parse
		
		Date utilDate =new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);
		
		//System.out.println(utilDate);
		
		java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
		
		//System.out.println(sqlDate);
		//format
		//return sqlDate;
		return sqlDate;
	}

	private static double setAccountBalance(Double _balance) {
		
		try{
			
			BufferedReader brRead=new BufferedReader(new InputStreamReader(System.in));
			do{
				if(_balance.doubleValue()<1000 ){
					System.out.println("Sorry! Minimum balance should be 1000...Enter again");
					_balance=Double.parseDouble(brRead.readLine());
				}
				else{
					break;
				}
				
			}while(true);
			return _balance;
			
		}catch(Exception e){
			System.out.println("Invalid Process...");
		}
		
		return 0;
	}
	
	
	//Step 3: Check duplicate customer name Re-Enter customer name if exists
	
	private static boolean checkCustomerNameExits(String temp,
			String[] customerNames) {
		//check exists
		for(String customerName:customerNames){
			if(temp.equals(customerName))
				return true;
		}
		 
		return false;
	}

	// Step 2: Proper validation for Name ->Regular Expression  :Balance 

	private static double setValidBalance(String balance) {


		try{
		Scanner scanner=new Scanner(System.in);
		
		Pattern balpat=Pattern.compile("[^0-9.0-9]");
		do{
			Matcher match=balpat.matcher(balance);
			boolean finder=match.find();
			
			if(finder)
			{
				System.out.println("Please enter valid balance..");
				 balance=scanner.nextLine();
			}
			else if(Double.parseDouble(balance)<10)
			{
				System.out.println("Please Enter the balance more than 10");
				balance=scanner.nextLine();
			}
			else if(Double.parseDouble(balance)>10000000)
			{
				System.out.println("Balance is more than limit");
				balance=scanner.nextLine();
			}
			else
			{
				break;
			}
			
		}while(true);
		}catch(Exception e){
			System.out.println("Invalid balance entry");
		}
		
		return Double.parseDouble(balance);
	}

	private static String setValidCustomerName(String customerName) {
		
		try{
			//creating objectfor bufferReader
			
			//InputStreamReader isRead=new InputStreamReader(System.in);
			//BufferedReader brRead =new BufferedReader(isRead);
			
			BufferedReader brRead=new BufferedReader(new InputStreamReader(System.in));
			
			
			//creating pattern using regular expression
			Pattern objpat=Pattern.compile("[^A-Za-z ]");
			
			do{
				//Matches
				Matcher matcher=objpat.matcher(customerName);
				boolean finder=matcher.find();
				
				if(finder){//false
					System.out.println("Name nust contain only Alphabets. Entr again name...");
					customerName=brRead.readLine();
				}
				else if(customerName.length()<3){
					System.out.println("Name should contain minimum 3 cgaracters. enter Again :");
					customerName=brRead.readLine();
				}
				else if(customerName.length()>30){
					System.out.println("name Contains more than 30characters. re-enter name");
					customerName=brRead.readLine();
				}
				else{
					break;
				}
			}while(true);
			
			return customerName;
			
		}catch(Exception e){
			System.out.println("Invalid entry in customer name....");
		}
		
		
		
		
		return customerName;
	}
	
	
    
    //Step 4: Display output in tabulaar format  
	private static void displayOutPut(String [] _customerNames,double [] _balance,Date [] _arrDoj) {
        //Declare Scanner
		Scanner scanner=new Scanner(System.in);
		try{
			System.out.println("Press x key to see customer info...");
			try{
				char pressKey=scanner.nextLine().charAt(0);
				if(pressKey=='x'){
					scanner.close();
					System.out.println(String.format("%-20s%-20s%-20s%n","Customer Name","Balance","Join Date"));
					System.out.println("-----------------------------------------------------------------------");
					//printing
					for(int j=0;j<_customerNames.length;j++)
					{
						System.out.println(String.format("%-20s%-20s%-20s%n",_customerNames[j],_balance[j],_arrDoj[j]));
					}
				}
				
			}catch(StringIndexOutOfBoundsException e){
				System.out.println("Thank you for choosing");
				System.exit(0);
			}
		}catch(Exception e){
			System.out.println("Application is existing....");
			System.exit(0);
		}
		
	}

	
	

}
