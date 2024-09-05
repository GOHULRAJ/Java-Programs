package com.MyBasicProgram;
import java.util.Scanner;

public class GetInputsFromUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int arr[]=new int[10];
		System.out.println("Enter an Number of Integer you Added:");
		int userCount=sc.nextInt();
		for(int i=0;i<userCount;i++) {
			System.out.println("Enter"+ i+ "Integer:");
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
//		for(int e:arr) 
//			sum=sum+e;
		System.out.println("Total:"+sum);
	}
}
