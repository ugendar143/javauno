package com.unocarrier;

public class Reverse {

	public static void main(String[] args) {
       String str = "987654321";
		
		char[] charArry = str.toCharArray();
		String res = "";
		
		for(int i=charArry.length-1;i>=0;i--) {
			res = res +charArry[i];
		}
		System.out.print(res);

	}

}
