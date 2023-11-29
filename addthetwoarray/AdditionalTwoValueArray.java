package com.kn.addthetwoarray;

public class AdditionalTwoValueArray {
	public int[] isAdditionalTwoValueArray(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int[] crr=new int[arr.length];
		for(int i=0;i<crr.length;i++) {
			crr[i]=(arr.length) + (brr.length);
		}
		
		return crr;
	}
	
	

}
