package com.BusReservation;
import java.util.Scanner;
import java.util.ArrayList;
public class BusReservation {
	public static void main(String args[]) {
		ArrayList <Bus> buses=new ArrayList <Bus>();
		ArrayList <Booking> bookings=new ArrayList <Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,true,45));
		buses.add(new Bus(3,true,50));
		buses.add(new Bus(4,true,33));

		int userInput=1;
		
		Scanner sc=new Scanner(System.in);
		
		for(Bus bus:buses) {
			bus.displayBusInfo();
		}
		
		while(userInput==1) {
			System.out.println("Welcome to My Bus Reservation System");
			System.out.println("Enter 1 for Booking 0 for exist:");
			userInput=sc.nextInt();
			if(userInput==1) {
				Booking booking=new Booking();
			if(booking.isAvailable(bookings,buses))
			{
				bookings.add(booking);
				System.out.println("Booking is confirmed");
			}
			else {
				System.out.println("Sorry, Bus is full, try another bus or date");
			}
		}
	}
	}
	
}
