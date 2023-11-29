package com.kn.oops.encapsulation;

public class ClassRoom {

	private int temprature;

	public ClassRoom(int temprature) {
		
		this.temprature = temprature;
	}
	public int getTemprature() {
		return this.temprature;
	}
	public void setTemprature(int temprature) {
		if(temprature >=20 && temprature <=25) {
			this.temprature=temprature;
		}else {
			System.out.println("Invalid Temprature, it must be between 20-25");
		}
	}
	
	}


