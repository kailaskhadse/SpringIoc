package com.logic;

public class DuplicateElement {

	public static void main(String[] args) {
		int a[]= {20,10,30,10,8,20,8,7,30};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
