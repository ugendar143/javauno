package com.practise;

public class ArrayRecursion {

	public class Demo {
		
		public static void main(String[] args) {
		
			int[] n= {30,50,60,8,9,7,3};
		
			System.out.println(sumArr(n,n.length-1));
		}
		private static int sumArr(int[] n, int size) {
			
			if(size == 0) return n[0];
			
			else return n[size]+sumArr(n,size-1);	
		}
	}
}

	
