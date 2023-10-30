package com.unocarrier;



public class Demo {

		public static void main(String[] args) {
			String str1 = "Hello";
			String str2 = "Friend";
			String t;

			System.out.println("Before Swapping");
			System.out.println("STR1---->"+str1);
			System.out.println("STR2---->"+str2);
			
			
			str1 = str1 + str2;// "Welcome"+"Hello"="WelcomeHello"
			str2 = str1.substring(0, str1.length()-str2.length());//"Welcome"
			str1=  str1.substring(str2.length());
			
			
			
			
			System.out.println("After Swapping");
			
			System.out.println("STR1---->"+str1);
			System.out.println("STR2---->"+str2);
			



	}

}
