package com.nissan.model;

public class Counter {
	
	//instance variable
	public static int count=0;
	
	//Step1-2:
	private static Counter objCounter=null;
	
	//default constructor
	//step 1-1: make constructor private
	private Counter(){
		super();
		count++;
		System.out.println("Count :"+count);
	}
	
	//Step 2:Write a static method that has return type object
	
	public static Counter getInstance(){
		//check condition
		if(objCounter==null){
			objCounter=new Counter();
		}
		return objCounter;
	}

}
