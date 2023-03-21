package com.logic;

public class MaximumNumberArray {

	public static void main(String[] args) {
	 int a[]= {10,50,40,30,20};
	 int max=a[0];
	 for(int i=0;i<a.length;i++) {
		 if(max<a[i]) {
			 max=a[i];
		 }
		 
	 }
	 System.out.println("maximum element of array :"+max);

	}

}
