package com.MyBasicProgram;

public class ReverseString {

	public static void main(String[] args) {
		String name="Subhani";
		char arr[]=name.toCharArray(); 
		for(int i=name.length()-1; i>=0;i--) {
			System.out.print(arr[i]);
		}
	}

}
