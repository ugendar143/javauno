package com.unocarrier;

public class OverLoaded {

	public static void main(String[] args) {

		System.out.println("demo");
		main();
		int[] x= {};
		main(x);
		char[] y= {};
		main(y);
		main(10,20);
		
	}

	public static void main() {
		System.out.println("ugendar");
			
	}
	public static void main(int[] args) {
		
		System.out.println("rajesh");
	}
	public static void main(char[] args) {
		System.out.println("ramesh");
		
	}
	public static void main(int a,int b) {
		
		System.out.println("sunny");
	}

}
