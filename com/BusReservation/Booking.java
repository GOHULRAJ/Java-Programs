package com.BusReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	 String passangerName;
	 int busNo;
	Scanner sc=new Scanner(System.in);
	
	Date date;
	
	public boolean isAvailable(ArrayList <Booking> bookings,ArrayList <Bus> buses) {
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getBusNo()==busNo) 
				capacity=bus.getCapacity();
			}
			int booked =0;
			for(Booking b:bookings) {
				if(b.busNo == busNo && b.date.equals(date)) {
					booked++;
				};
			}
		
		
		return booked<capacity?true:false;
	}
	
	Booking(){
		System.out.println("Enter passanger Name:");
		passangerName =sc.next();
		System.out.println("Enter Bus Number: ");
		busNo=sc.nextInt();
		System.out.println("Enter Date in this format dd-MM-yyyy: ");
		String dateInput=sc.next();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
