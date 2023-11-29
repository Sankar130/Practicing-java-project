package com.kn.oops.aggergation;

public class Pilot {
	String name ;
	double salary;
	public Pilot(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public void fiy() {
		System.out.println(this.name+" Pilot has Start Flying....");
	}

}
