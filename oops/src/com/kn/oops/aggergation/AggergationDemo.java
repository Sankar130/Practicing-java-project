package com.kn.oops.aggergation;

public class AggergationDemo {

	public static void main(String[] args) {
		Pilot p1 = new Pilot("Flying Beast",100000.00);
		Airline a1 = new Airline("Kingfisher",p1);
		
		a1.operation();
		a1=null;
		System.out.println("----------------------");
		System.out.println("Airline has been Shutdowm...");
		p1.fiy();
	}

}
