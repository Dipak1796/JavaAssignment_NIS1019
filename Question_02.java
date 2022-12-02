package com.nissan.app;

public class Question_02 {

	public static void main(String[] args) {
		
		arrayIndex();

	}

	private static void arrayIndex() {


		    // ceate array of size 10 size
			char [] character={'A','B','C','D','E','F','G','H','I','J'};
			try{
				for(int i=0;i<=character.length;i++)
				{
					//print array element
					System.out.println(character[i]);
				}
					
			}catch(ArrayIndexOutOfBoundsException e)
			{
				//exception msg
				System.out.println("index out of bound");
			}
		
	}

}
