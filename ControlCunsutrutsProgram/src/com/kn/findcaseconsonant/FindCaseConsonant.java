package com.kn.findcaseconsonant;

import java.util.Scanner;

public class FindCaseConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Vowel: ");
		char ch = scan.next().charAt(0);
		FindCaseConsinantDemo caseConsonant = new FindCaseConsinantDemo();
		caseConsonant.FindingVowelOrNOT(ch);
		scan.close();

	}

}
