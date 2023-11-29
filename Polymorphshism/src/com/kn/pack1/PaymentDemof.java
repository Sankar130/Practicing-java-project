package com.kn.pack1;

public class PaymentDemof {

	public static void main(String[] args) {
		 Payment p = new Payment();
		 p.bill();
		 p.offer();
		 p.pay();
		 System.out.println("***********************");
		 //UPIPayment u = new UPIPayment(); -->tight coupling
		 p= new UPIPayment();
		 p.bill();
		 p.offer();
		 p.pay();
		 System.out.println("***********************");
		// Ewallet w = new Ewallet();-->tight coupling
		 p= new Ewallet();
		 p.bill();
		 p.offer();
		 p.pay();
		 System.out.println("***********************");
		 //CreditCard c = new CreditCard();-->tight coupling
		 p= new CreditCard();
		 p.bill();
		 p.offer();
		 p.pay();
		 System.out.println("***********************");
	}

}
