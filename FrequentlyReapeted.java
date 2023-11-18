package com.practise;

public class FrequentlyReapeted {

	public static void main(String[] args) {
		int array[]= {1,2,8,3,2,2,2,5,1};
		int freq[]= new int[array.length];
		int visited=-1;
		for(int i=0;i<array.length;i++) {
			int count=1;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited) {
				freq[i]=count;
			}
			System.out.println("---------");
			System.out.println("element/frequently");
			System.out.println("---------");
			for(int i=1;i<array.length;i++) {
				if(freq[i]!=visited)
					System.out.println(" "+array[i]+" | "+freq[i]);
			}
			System.out.println("----------");
		}
	}
}
