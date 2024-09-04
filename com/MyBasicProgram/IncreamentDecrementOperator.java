package com.MyBasicProgram;

public class IncreamentDecrementOperator {
	public static void main(String args[]) {
//		int a=10;
//		a=a++ + ++a; //10--> 11-->12
//		System.out.println("a:"+a);
		
		int a=0,b=0,c;
		c=--a * --b * --a * b--;
		System.out.println(c);
	}
}
