package com.nissan.app;

import com.nissan.model.Counter;

public class DemoStaticNonStaticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter countOne=Counter.getInstance();
		System.out.println(countOne);
		Counter countTwo=Counter.getInstance();
		System.out.println(countOne);
		Counter countThree=Counter.getInstance();
		System.out.println(countThree);
		

	}

}
