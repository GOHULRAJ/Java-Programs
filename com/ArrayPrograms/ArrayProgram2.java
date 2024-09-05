package com.ArrayPrograms;

public class ArrayProgram2 {

	public static void main(String[] args) {
		int a[]= {4,3,7,11,50,1};
		int x=1,y=10,n=6;
		
		if(x<y) {
		
		for(int val :a) {
			if(val>x && val<y) {
				System.out.println(val);
			}
		}
		}
		else {
			System.out.println("mismatched");
		}
	}
}
