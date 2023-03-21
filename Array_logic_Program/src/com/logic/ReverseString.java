package com.logic;

public class ReverseString {

	public static void main(String[] args) {
	String s="Kamalnayan"; String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		char c=s.charAt(i);
		rev=rev+c;
	}
    System.out.println("reverse of string :"+rev);
	}

}
