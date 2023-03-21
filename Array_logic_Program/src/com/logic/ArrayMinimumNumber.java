package com.logic;

public class ArrayMinimumNumber {

	public static void main(String[] args) {
		
		int a[]= {10,50,60,20,5,80};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i])
			{
			 min=a[i];
			}
			
		}
		System.out.println("minimu element of array :"+min);

	

}}
