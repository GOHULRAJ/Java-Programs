package com.MyBasicProgram;
import java.util.Scanner;
public class IfDemo {
	public static void main(String args[]) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer:");
		num=sc.nextInt();
//		if(num>0) {
//			System.out.println("Given Number is positive");
//		}
//		else if(num==0){
//			System.out.println("Enter Number is Nutral");
//		}
//		else
//		{
//			System.out.println("Given Number is Negetive");
//		}
		if(num>=90 && num<100) {
			System.out.println("Grade -A");
		}
		else if(num>=80) {
			System.out.println("Grade -B");
		}
		else if(num>=70) {
			System.out.println("Grade -C");
		}
		else if(num>=60) {
			System.out.println("Grade -D");
		}
		else if(num<60){
			System.out.println("Grade -E");
		}
		else {
			System.out.println("Out of bound");
		
		}
	}

}
