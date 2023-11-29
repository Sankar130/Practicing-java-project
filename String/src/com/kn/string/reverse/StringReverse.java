package com.kn.string.reverse;

public class StringReverse {

	
		public static String reverseString(String inputString) {
			//Convert to character Array
			char[] crr= inputString.toCharArray();
			//create StringBuffer
			StringBuffer stringBuffer = new StringBuffer();
			//Keep appending character 1 by 1
			for(int i=crr.length-1;1>=0;i--) {
				stringBuffer=stringBuffer.append(crr[i]);
			}
		
	}

}
