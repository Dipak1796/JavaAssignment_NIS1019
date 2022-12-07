package com.nissan.col;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class DemoCollections {

	public static void main(String[] args) {

 
		/*
		//Non-Generic
		//ArrayList
		List lstItems=new ArrayList();
		
		//NOt Type Safe  --- add() remove() findAll()...
		lstItems.add(1234.34); //float
		lstItems.add("Nissan");//String
		lstItems.add(true);    //boolean
		lstItems.add(null);    //null
		lstItems.add('y');     //Character
		
		//print
		for(Object item:lstItems){
			System.out.println(item);
		}
		
		List<Integer> lstItemsTwo=new ArrayList<>();
		
		lstItemsTwo.add(1134);
		lstItemsTwo.add(6547);
		lstItemsTwo.add(6452);
		lstItemsTwo.add(7342);
		
		for(Object item:lstItemsTwo){
			System.out.println(item);
		}
		
		//toArray Convert
		
		System.out.println(lstItemsTwo.toArray());
		
		
		//List Iterator --forward direction
		ListIterator itr=lstItemsTwo.listIterator();
		
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		while(itr.hasPrevious()){
			System.out.print(itr.previous()+" ");
		}
		*/
		//Dictionary : Map
		Scanner scanner=new Scanner(System.in);
		
		
		Map<String,String> statesAnsCapital=getStateCapitals();
		
		System.out.println("Enter the state name");
		String state=scanner.nextLine();
		
		//checkCondition
		if(statesAnsCapital.containsKey(state)){
			System.out.println(statesAnsCapital.get(state) );
		}else{
			System.out.println("Invalid name...");
		}
		
	}
	
	public static HashMap<String,String> getStateCapitals(){
		//When State name is given ,from the map Capital should be retrieved
		
				HashMap<String,String> hashMap=new HashMap<>();
				
				
				   hashMap.put("Maharashtra", "Mumbai");
				   hashMap.put("Madhya Pradesh", "Bhopal");
			       hashMap.put("Kerala", "Thiruvnanthpuram");
				   hashMap.put("Goa", "Panaji");
				   hashMap.put("Assam", "Dispur");
				   hashMap.put("Andhra Pradesh", "Hyderabad");
				   hashMap.put("Arunachal Pradesh", "Itanagar");
				   hashMap.put("Bihar", "Patna");
				   hashMap.put("Chhattisgarh", "Raipur");
				   hashMap.put("Gujarat", "Gandhinagar");
				   hashMap.put("Haryana", "Chandigarh");
				   hashMap.put("Himachal Pradesh", "Shimla");
				   
				   
				   return hashMap;


	}

}
