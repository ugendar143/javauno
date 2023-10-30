package com.unocarrier;

class demo2 {
	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void add(String fname, String lname) {
		System.out.println(fname + " " + lname);
	}

}

public class InterFace {

	public static void main(String[] args) {

		demo2 demo = new demo2();

		demo.add(10, 20, 40);
		demo.add(10, 20, 100);

		demo.add("Sunny", "Ramesh");

	}

}
