package com.unocarrier;

public class polydrome {

	public static void main(String[] args) {
		//Java String program to check whether a string is a Palindrome
		String str = "987656789";
		boolean isPoly = true;
		for(int l=0,r=str.length()-1;l<str.length()/2;l++,r--) {
			if(str.charAt(l) != str.charAt(r)) {
				isPoly = false;
				break;
			}//if
		}// for
		if(isPoly == true) System.out.println("It is Polyndrome");
		else System.out.println("Not Polyndrome");

	}

}
