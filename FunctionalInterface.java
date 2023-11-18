package com.practise;

public class FunctionalInterface {
	
		interface Numbers{
			
			
			int add(int a,int b);
		}		
			
			public static void main(String[] args) {
			
				Numbers nums =  (a,b)->{
					 return a+b;
				 };
				 
				 int res = nums.add(400,200);
				 System.out.println(res);
			
			}

		// functional interface
		
	}

