package com.te.assignmets.hackerrank;

import java.util.Scanner;

public class IfElseProblem {

	public void ifELse() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number N :");
		int N = scanner.nextInt();
		scanner.close();

		if (N % 2 == 0 && ((N >= 2 && N <= 5) || N > 20)) {
			System.out.println("Not Weird");
		} else if (N % 2 == 1 || (N >= 6 && N <= 20)) {
			System.out.println("Weird");
		}
	}

}
