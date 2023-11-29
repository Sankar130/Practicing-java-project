package com.kn.multithreading;

public class Jerry implements Runnable{
	HospitalDemo h;

	public Jerry(HospitalDemo h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.jerryTreament();
	}
	

}
