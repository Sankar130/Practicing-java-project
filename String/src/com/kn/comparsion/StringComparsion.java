package com.kn.comparsion;

public class StringComparsion {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Ram";
		
		System.out.println("=======>Reference Comparsion<========");
		if(s1==s2) {
			System.out.println("Reference are Pointing Same Object ");
		}else {
			System.out.println("Reference are Pointing Different Object ");	
		}
		System.out.println("=======>Content Comparsion<=========");
		if(s1.equals(s2)) {
			System.out.println("Same Data ");
		}else {
			System.out.println("Different Data");	
		}
		
	}

}
