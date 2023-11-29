package com.kn.oops.composition;

public class Page {
	 String content;
	int number;
	public Page(String content, int number) {
		this.content = content;
		this.number = number;
	}
	public void text() {
		System.out.println(this.content+" Content.....");
		
	}

}
