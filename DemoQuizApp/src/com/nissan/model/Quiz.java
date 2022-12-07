package com.nissan.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
	
	
	
	public static int startExam(){
		int i=0;
		Scanner scanner=new Scanner(System.in);
		Map<String,String> statesAnsCapital=getStateCapitals();
		
		System.out.println("Q1.What is the Capital of Goa:\nAns--");
		String Ans=scanner.nextLine();
		if(Ans.equalsIgnoreCase(statesAnsCapital.get("Goa")))
			i++;
		System.out.println("Q2.What is the Capital of Maharashtra\nAns--");
		 Ans=scanner.nextLine();
		if(Ans.equalsIgnoreCase(statesAnsCapital.get("Maharashtra")))
			i++;
		System.out.println("Q3.What is the Capital of Assam\nAns--");
		 Ans=scanner.nextLine();
		if(Ans.equalsIgnoreCase(statesAnsCapital.get("Assam")))
			i++;
		System.out.println("Q4.What is the Capital of Bihar\nAns--");
		 Ans=scanner.nextLine();
		if(Ans.equalsIgnoreCase(statesAnsCapital.get("Bihar")))
			i++;
		System.out.println("Q5.What is the Capital of Gujarat\nAns--");
		 Ans=scanner.nextLine();
		if(Ans.equalsIgnoreCase(statesAnsCapital.get("Gujarat")))
			i++;
		return i;
		
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
