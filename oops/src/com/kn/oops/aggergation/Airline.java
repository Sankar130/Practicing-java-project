package com.kn.oops.aggergation;

public class Airline {
	String name;
	Pilot pilot;
	public Airline(String name, Pilot pilot) {
		super();
		this.name = name;
		this.pilot = pilot;
	}
	public void operation() {
		System.out.println(this.name+ " Airline has Started it's operation");
		this.pilot.fiy();
	}
	

}
