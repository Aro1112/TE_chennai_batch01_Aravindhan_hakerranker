package com.tecno.hackerrank;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		sc.close();

		String str1 = "";
		for (int i = str.length()-1; i >= 0; i--) {
			str1 = str1+str.charAt(i); //str1 += str.charAt(i);
		}
		if (str1.equals(str)) {
			System.out.println("The given string is palindrome");
		} else {
			System.out.println("The given string is not palindrome");
		}

	}
}
