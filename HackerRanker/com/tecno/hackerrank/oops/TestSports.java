package com.tecno.hackerrank.oops;

public class TestSports {
	
	public static void main(String[] args) {
		Sports a = new Sports();
		Cricket b = new Cricket();
		System.out.println(a.name("Generic Sports"));
		System.out.println("Each team has n players in "+a.name("Generic Sports"));
		System.out.println(b.name("Cricket class"));
		System.out.println("Each team has "+ b.getNum(11) +" players in "+a.name("Cricket class"));
		
	}

}
