package com.logic;

public class ShortingElement {

	public static void main(String[] args) {
		int a[]= {10,60,7,8,10,11,45};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				temp=a[j];
				System.out.print(temp+" ");
			}
			System.out.print(temp+" ");
		}

	}

}
