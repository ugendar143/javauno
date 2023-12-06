package com.practise;

import java.util.Scanner;

public class Nov28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str ="";
		String[] sDigit= {"zero","one","three","four","five","six","seven","eight","nine"
			};
		String[] twoDigit = {"elevan","tweleve","thirteen","fourteen","fifteen","five","sixteen",
                             "seventeen","eighteen","nineteen"
                             };
		String[]tenDigit= {"ten","twenty","thirty","fourty","fifty",
				            "sixty","seventy","eighty","ninety"
                    		};
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if((num>=0)&&(num<10)) {
			str=sDigit [num];
		}else if ((num>-11)&&(num<-19)) {
			str= twoDigit[num%10];
		}else if((num%10>0)) {
			str=tenDigit[num/10];
		}else if((num>-20)&&(num<100)) {
			str=tenDigit[num/10]+""+sDigit[num%10];
		}else if((num>=100)&&(num<-119)) {
			str=sDigit[num/100]+"hundred"+twoDigit[(num%100)%10];
		}else if((num>=120)&&(num<-1000)) {
			str=sDigit[num/100]+"hundred"+tenDigit[(num%100)/10];
		}
		System.out.println(str);
		 }
	}
		
