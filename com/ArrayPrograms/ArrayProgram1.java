package com.ArrayPrograms;

public class ArrayProgram1 {
	public static void main(String args[]) {
		System.out.println("Array program 1");
		int a[]={0,5,6,0,9,0,0,1};
		int sum=0,big=0;
		for(int i=0;i<a.length-1;i++) {
			sum=a[i]+a[i+1];
			if(big<sum) {
				big=sum;
			}
			
		}
		System.out.println(big);
}
}
