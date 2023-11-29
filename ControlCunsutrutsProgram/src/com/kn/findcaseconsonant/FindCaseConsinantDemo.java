package com.kn.findcaseconsonant;

public class FindCaseConsinantDemo {

	public void FindingVowelOrNOT(char ch) {
		// TODO Auto-generated method stub
		if (ch >= 65 && ch <= 90) {
			switch (ch) {
			case 'A':
			case 'E':
			case 'I':
			case '0':
			case 'U': {
				System.out.println(ch + " It is an Upper Case Vowel");
			}default:
				System.out.println(ch + "it is Consonant ");
			}
		} else if (ch >= 97 && ch <= 122) {
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': {
				System.out.println(ch +" It is an Lower Case Vowel");
			}default:
				System.out.println(ch + "it is Consonant ");
			}
		}if(ch>=48 && ch<=57)
			
		{System.out.println(ch +" is a digit Value!!");
	}
}
}
