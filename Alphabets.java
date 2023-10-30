package com.unocarrier;


public class Alphabets {

	public static void main(String[] args) {

		String str = " Hello Welcome to Nalgonda";
		char ch;
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			// 65--- 90----A-z
			if (ch >= 65 && ch <= 90) {// A-Z
				res = res + (char) (ch + 32);
			} else if (ch >= 97 && ch <= 122) {// a-z
				res = res + (char) (ch - 32);
			} else {
				res = res + ch;
			}
		} // for

		System.out.println("Result--->" + res);
	}

}
