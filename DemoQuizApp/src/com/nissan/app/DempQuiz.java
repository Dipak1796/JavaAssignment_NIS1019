package com.nissan.app;

import java.util.HashMap;
import java.util.Scanner;

import com.nissan.model.Quiz;

public class DempQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ask the user to Enter your name:
		//Display each question id shiffled manner:
		      //eg:Enter capital of Maharastra:---
		//Display result with score:
		    //FullMark -Extra Brilliant
		            // -Good Effrot
		            // -try again
		
		Scanner scanner=new Scanner(System.in);
		char choice='n';
		do{
		System.out.println("Enter Your Name :");
		String name=scanner.nextLine();
		
		System.out.println("\n1.Start Exam");
		System.out.println("2.Exit");
		System.out.println("=========================");
		System.out.println("Enter your choice");
		int ch=scanner.nextInt();
		switch(ch){
		case 1 :
			    int score=Quiz.startExam();
			    System.out.println("Name :"+name);
			    System.out.println("Your Total Score :"+score);
			    if(score==5){
			    	System.out.println("Extra Brillient");
			    }else if(score<5&&score>2){
			    	System.out.println("Good Effort");
			    }else{
			    	System.out.println("Try Again");
			    }
		case 2 :
			    choice='n';
			    break;
		default:
			   System.out.println("Invalid Input");
			   break;
			}
		System.out.println("Do you want continue...");
		choice=scanner.nextLine().charAt(0);
		}while(choice=='y'||choice=='Y');

	}
	


}
