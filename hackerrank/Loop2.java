 package com.te.assignmets.hackerrank;

public class Loop2 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3; 
		int n = 5;
		 int i=1;
	        int res = (int) (a+Math.pow(2,0)*b);
	        while (i<n) {
	            int r = (int) (res+Math.pow(2, i)*b);
	            System.out.print(res +" "+r +" ");
	            i++;
	        }
	}

}
