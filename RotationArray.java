package com.practise;

public class RotationArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=3;
		System.out.println("Original value");
		for( int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		for(int i=0;i<n;i++) {
			int j,first;
			first =arr[0];
			for(j=0;j<arr.length;j++) {
				arr[j]=arr[j+1];
			}
		       arr
		}
		
	}

}
