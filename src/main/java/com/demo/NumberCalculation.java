package com.demo;

public class NumberCalculation {
	String temp="";
	// Hello
	public int add(int x, int y) {
		return  x + y;
	}

	public String convertCase(String str) { //str=hello //ASCII 97-121, 65,91
		
		for(int i=0;i<str.length();i++) {
			int x=str.charAt(i);
			x=x-32;
			temp=temp+ (char)x;
			
		}
		return temp;
	}
}
