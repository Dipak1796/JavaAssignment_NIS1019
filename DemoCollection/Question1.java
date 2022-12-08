package com.nissan.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
	/*1. Create an array with duplicate values. 
	 * Using collections to print all duplicate values.*/
	public static void main(String[] args)
	{
		int[] array=new int[5];
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> duplicates=new ArrayList<Integer>();
		System.out.println("Enter numbers with duplicates: ");
		//checking for duplicate values
		for(int i=0;i<array.length;i++)
		{
			array[i]=input.nextInt();
			if(list.contains(array[i]))
			{
				duplicates.add(array[i]);
			}
			else
			{
				list.add(array[i]);
			}
		}
		System.out.println("Duplicates are: "+duplicates);
		for(int element: duplicates)
		{
			System.out.println(element);
		}
		
	}
}
