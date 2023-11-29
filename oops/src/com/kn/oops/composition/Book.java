package com.kn.oops.composition;

public class Book {
	String name;
	 Page page;
	public Book(String name) {
		this.name = name;
		this.page= new Page("Best book as be Learn",100);
	}
	public void read() {
		System.out.println(this.name+" Start Reading Book Daily....");
		this.page.text();
	}
	

}
