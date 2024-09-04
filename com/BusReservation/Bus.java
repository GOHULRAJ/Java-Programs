package com.BusReservation;

public class Bus {
	private int BusNo;
	private boolean Ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap){
		BusNo=no;
		Ac=ac;
		capacity=cap;
	}
	
	
	public int getBusNo() {
		return BusNo;
	}

	public void setBusNo(int busNo) {
		BusNo = busNo;
	}

	public boolean isAc() {
		return Ac;
	}

	public void setAc(boolean ac) {
		Ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus Num: "+BusNo+" ,"+" Ac: "+Ac+", "+"Capacity:"+capacity);
	}
	
	
	
}
