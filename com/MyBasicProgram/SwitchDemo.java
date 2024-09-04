package com.MyBasicProgram;
import java.util.*;
public class SwitchDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First integer:");
		int a=sc.nextInt();
		System.out.println("Enter Second integer:");
		int b=sc.nextInt();
		
		System.out.println("Enter Operation '+','-','*','/' and '%' :");
		char operator=sc.next().charAt(0);
		switch(operator) {
		case '+':
			System.out.println(a+" + "+b+" "+" = "+(a+b));
		break;
		case '-':
			System.out.println(a+" - "+b+" "+" = "+(a-b));
		break;
		case '*':
			System.out.println(a+" * "+b+" "+" = "+(a*b));
		break;
		case '/':
			System.out.println(a+" / "+b+" "+" = "+(a/b));
		break;
		default:
			System.out.println("nothing");
		}
		
		
	}
}
