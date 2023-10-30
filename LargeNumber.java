package com.unocarrier;


public class LargeNumber {

	public static void main(String[] args) {

		int num[]= {-7,0,8,19,20,15,-10,-60,8,-8};
		int big=num[0];
		for(int i=0;i<num.length;i++) {
			if(big<num[i]) {
				big=num[i];
			}
		}
			System.out.println("largest number:"+big);
	}
	}


