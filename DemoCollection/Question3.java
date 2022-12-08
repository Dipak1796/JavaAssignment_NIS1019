package com.nissan.model;

import java.util.ArrayList;
import java.util.HashSet;

public class Question3 {
	/*
	 * 3. Retrive data from HashSet 
	 * and store it in an ArrayList and
		display from ArrayList.
	 */
	public static void main(String[] args)
	{
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(99);
		set.add(78);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i:set)
		{
			list.add(i);
		}
		for(int j :list)
		{
			System.out.println(j);
		}
	}
}
