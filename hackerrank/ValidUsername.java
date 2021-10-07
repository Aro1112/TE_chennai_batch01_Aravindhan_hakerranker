package com.te.assignmets.hackerrank;

import java.util.Scanner;

public class ValidUsername {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Username : ");
		String name = s.nextLine(); 
		s.close();
		boolean isValid = false;
		if(name.length() < 8 && name.length() <30 ) {
			for (int i = 0; i < name.length() ; i++) {
				char temp = name.charAt(i);
				if((temp >='a' && temp <='z') || (temp >='A'&& temp <='Z') 
						|| (temp >= '0' && temp <='9') || temp =='_' ) {
					isValid= true;					
				}
			}
		} else {
			isValid= false;
		}
		System.out.println(isValid ? "Valid Username":"Invalid username");
		
	}
}
