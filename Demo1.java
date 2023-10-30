package com.unocarrier;

public class Demo1 {


		public static void main(String[] args) {
			String strA = "Hellow";
			String strB = "Rajesh";
			String t;

			System.out.println("Before Swapping");
			System.out.println("STRA---->"+strA);
			System.out.println("STRB---->"+strB);
			
			
			strA = strA + strB;// "Welcome"+"Hello"="WelcomeHello"
			strB = strA.substring(0, strA.length()-strB.length());//"Welcome"
			strA=  strA.substring(strB.length());
			
			
			
			
			System.out.println("After Swapping");
			
			System.out.println("STRA---->"+strA);
			System.out.println("STRB---->"+strB);

	}

}
