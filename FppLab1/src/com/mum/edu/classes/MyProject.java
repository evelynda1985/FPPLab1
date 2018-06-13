package com.mum.edu.classes;

public class MyProject {
	
	private String text = "Welcome";
	
	private static String text1 = "Hello World";
	
	public String welcome() {
		return text;
	}
	
	public static String text2() {
		return text1;
	}

	public MyProject() {	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Welcome object [text=" + text + "]";
	}
	

}
