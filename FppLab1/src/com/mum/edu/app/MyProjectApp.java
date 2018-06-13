package com.mum.edu.app;

import com.mum.edu.classes.MyProject;

public class MyProjectApp {

	public static void main(String[] args) {
		
		//Static
		
		System.out.println(MyProject.text2());
		
		//Non Static
		
		MyProject welcome1 = new MyProject();
		System.out.println("Welcome 1: " + welcome1);

	}

}
