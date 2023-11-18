package com.practise;

public class Demo {

	public static void main(String[] args) {
		
		int array1[]= new int[] {1,2,3,4,6,7};
		int array2[]= new int[array1.length];
		
		for(int i=0;i<array1.length;i++) {
		    array2[i]=array1[i];
		}
		System.out.println("elements of original");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}	
			System.out.println("\nelements of new" );
		
		for (int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
	}

}
