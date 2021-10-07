package com.te.assignments.hackerrank.oops;

import java.time.LocalDate;

public class Date {
	public static void main(String[] args) {
		int mm = 12;
		int dd = 11;
		int yy = 1997;
		LocalDate dt = LocalDate.of(yy, mm, dd);
		System.out.print(dt.getDayOfWeek());

		
	}
}
