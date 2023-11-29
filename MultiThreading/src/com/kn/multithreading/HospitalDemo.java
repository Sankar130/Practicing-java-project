package com.kn.multithreading;

public class HospitalDemo {
	String res1 = "Doctor";
	String res2 = "Bed";
	
	public void tomTreament() {
		try {
			synchronized (res1) {
				System.out.println("Tom is Using "+ res1);
				Thread.sleep(2000);
				synchronized (res2) {
					System.out.println("Tom is Using "+ res2);
					Thread.sleep(2000);
				
			}
		}
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	

}
	public void jerryTreament() {
		try {
			synchronized (res1) {
				System.out.println("Jerry is Using "+ res1);
				Thread.sleep(2000);
				synchronized (res2) {
					System.out.println("Jerry is Using "+ res2);
					Thread.sleep(2000);
				
			}
		}
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}
}
