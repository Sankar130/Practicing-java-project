package com.kn.comparsion;

public class StringComparsonDemo2 {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Sita";
		String s3=s1+s2;
		String s4=s1+s2;
		
		System.out.println("=======>Reference Comparsion<========");
		if(s3==s4) {
			System.out.println("Reference are Pointing Same Object ");
		}else {
			System.out.println("Reference are Pointing Different Object ");	
		}
		System.out.println("=======>Content Comparsion<=========");
		if(s3.equals(s4)) {
			System.out.println("Same Data ");
		}else {
			System.out.println("Different Data");	
		}
	}

}
