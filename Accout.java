package com.unocarrier;

public class Accout {

	public static void main(String[] args) {
		
		int num[]= {2,3,4,-5,6,-7,0,8,19};
		int big=num[0];
		for(int i=0;i<num.length;i++) {
			if(big<num[i]) {
				big=num[i];
			}
		}
			System.out.println("largest number:"+big);
	}
	}
