package com.practise;
  
interface Evenodd{
	boolean isEven(int num);
}

public class InterfaceEvenOdd {

	public static void main(String[] args) {
	
		Evenodd eOdd=(num)->{
			if(num%2==0)return true;
			else return false;
		};
		boolean res=eOdd.isEven(13);
		System.out.println(res);
	}

}
