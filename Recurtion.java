package com.practise;

public class Recurtion {
	public static void main(String[] args) {
	int n=15;
	System.out.println(sumRec(n));
	}
   private static int sumRec(int n) {
	   if(n==1) return 1;
	   else {
		   if(n%2==0)return sumRec(n-1);
		   else return n+sumRec(n-1);
	   }
   }
}
