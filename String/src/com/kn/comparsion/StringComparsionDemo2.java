package com.kn.comparsion;

public class StringComparsionDemo2 {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Sita";
		String s3="Ram"+"Sita";
		String s4="Ram"+"Sita";
		
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


