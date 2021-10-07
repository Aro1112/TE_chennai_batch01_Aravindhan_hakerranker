package com.te.assignments.hackerrank.oops;

class TestAdd {

	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getSimpleName());
		System.out.println(a.add(10, 20));
	}

}
