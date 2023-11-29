package com.kn.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println("Size = "+sb.length());
		System.out.println("Capacity = "+sb.capacity());
		System.out.println("****************");
		StringBuffer sb1=new StringBuffer(4);
		System.out.println("Size = "+sb1.length());
		System.out.println("Capacity = "+sb1.capacity());
		System.out.println("****************");
		sb1.append("java");
		System.out.println("Size = "+sb1.length());
		System.out.println("Capacity = "+sb1.capacity());
		System.out.println("****************");
		sb1.append("script");
		System.out.println("Size = "+sb1.length());
		System.out.println("Capacity = "+sb1.capacity());
		System.out.println("****************");
		
		
	}

}
