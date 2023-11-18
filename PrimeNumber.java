package com.practise;

interface Primenumber{
	void isPrime(int num);
}

public class PrimeNumber {

	public static void main(String[] args) {
		
		PrimeNumber pno= ( num)->{
			int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
		  }
		
		if (count==2) {
			System.out.println("True");
		}else {
			System.out.println("Flase");
		}
	
	pno.isPrime(18);
		
		
		
	
	



