package com.nissan.bean;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssetUtility {
	
	static final Scanner scanner=new Scanner(System.in);
	
	public static void getInputFromUser(){
		
		Scanner input=new Scanner(System.in);
		
		String [] computerName=new String[5];
		String [] brand=new String[5];
		Date [] manufacturingDate=new Date[5];
		boolean [] isAvailabe=new boolean[5];
		int [] quantity=new int[5];
		
		
		char choice='n';
		int i=0;
		try{
			
			do{
			//take inputs from user
			System.out.println("Enter Computer Name");
			String temp=setValidName(input.nextLine());
			computerName[i]=temp;
			
			System.out.println("Enter Brand Name");
			String brandName=setValidName(input.nextLine());
			brand[i]=brandName;
			
			System.out.println("Enter Manufacturing Date(dd/MMM/yyyy)");
			String mnfDate=input.nextLine();
			manufacturingDate[i]=convertStringToDate(mnfDate);
			
			System.out.println("Asset of current brand is Availabele");
			boolean flag=scanner.nextBoolean();
			if(!flag)
			{
				isAvailabe[i]=flag;
				quantity[i]=0;
			}
			else{
				isAvailabe[i]=flag;
				
				System.out.println("Enter the Quantity of Assests");
				int qnt=validQuantity(scanner.nextInt());
				quantity[i]=qnt;
			}
			
			//increment
			i++;
			
			System.out.println("Do you want to continue....");
			choice=input.nextLine().charAt(0);
			
			}while(choice=='y'|| choice=='Y');
			
		}catch(Exception e){
			System.out.println("Invalid data insertion..");
		}finally{
			displayOutPut(computerName,brand,manufacturingDate,isAvailabe,quantity);
		}
		
	}

	private static int validQuantity(int qnt) {
		
try{
			
			BufferedReader brRead=new BufferedReader(new InputStreamReader(System.in));
			do{
				if(qnt<0 ){
					System.out.println("Sorry! Minimum quantity should be 1 ...Enter again");
					qnt=Integer.parseInt(brRead.readLine());
				}
				else{
					break;
				}
				
			}while(true);
			return qnt;
			
		}catch(Exception e){
			System.out.println("Invalid Process...");
		}
		
		return 0;
	}

	private static String setValidName(String inputName) {
		try{
	
			
			BufferedReader brRead=new BufferedReader(new InputStreamReader(System.in));
			
			
			//creating pattern using regular expression
			Pattern objpat=Pattern.compile("[^A-Za-z ]");
			
			do{
				//Matches
				Matcher matcher=objpat.matcher(inputName);
				boolean finder=matcher.find();
				
				if(finder){//false
					System.out.println("Name nust contain only Alphabets. Entr again name...");
					inputName=brRead.readLine();
				}
				else if(inputName.length()<2){
					System.out.println("Name should contain minimum 3 cgaracters. enter Again :");
					inputName=brRead.readLine();
				}
				else if(inputName.length()>30){
					System.out.println("name Contains more than 30characters. re-enter name");
					inputName=brRead.readLine();
				}
				else{
					break;
				}
			}while(true);
			
			return inputName;
			
		}catch(Exception e){
			System.out.println("Invalid entry in customer name....");
		}
		return null;
	}
	
	private static Date convertStringToDate(String joinDate) throws ParseException {


		//java.util.Date format is dd/MM/yyyy--->SimpleDateFormat
		//Parse
		
		Date utilDate =new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);
		
		//System.out.println(utilDate);
		
		java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
		
	
		return sqlDate;
	}
	
	private static void displayOutPut(String [] _computerNames,String [] _brand,Date [] _mnfDate,boolean [] _isAval,int [] qnt) {
        //Declare Scanner
		Scanner scanner=new Scanner(System.in);
		try{
			System.out.println("Press x key to see Asset info...");
			try{
				char pressKey=scanner.nextLine().charAt(0);
				if(pressKey=='x'){
					scanner.close();
					System.out.println(String.format("%-20s%-20s%-20s%-20s%-20s%n","Computer Name","Brand","Manufacture Date","Is Available","Quantity"));
					System.out.println("-----------------------------------------------------------------------------------------------------------------");
					//printing
					for(int j=0;j<_computerNames.length;j++)
					{
						System.out.println(String.format("%-20s%-20s%-20s%-20s%-20s%n",_computerNames[j],_brand[j],_mnfDate[j],_isAval[j],qnt[j]));
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
