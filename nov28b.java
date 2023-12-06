package com.practise;

import java.util.Scanner;

public class nov28b {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				
				
				String[] singleDigit = {
										"zero","one","two","three","four","five",
										"six","seven","eight","nine"
								  	   };
				String[] twoDigit = {
									 "","elevan","tweleve","thirteen","fourteen","fifteen","sixteen",
									 "seventeen","eighteen","nineteen"
									 };
				String[] tenDigit = {
										"",	"ten","twenty","thirty","fourty","fifty",
										"sixty","seeventy","eighty","ninety"
									};
				
				String inWords = "";
				System.out.println("Pls Enter Number in Between 0---19?");
				int num = sc.nextInt();
				
				// 123... 456...999
				int p=1;
				int t = num;
				while(num !=0) {
					num = num/ 10;
					p=p*10;
				}
				p=p/10;
				num = t;
				int r;
				// 719
				// 239
				while(num != 0) {
					r = num / p;//39 
					if(p==100) {
						inWords = inWords + singleDigit[r]+" hundred";
					}
					else if( (p==10) && ((num >=11) && (num <=19)) ) {
						inWords = inWords +" "+ twoDigit[num % 10];
					}
					else if( p==10) {
						inWords = inWords +" "+ tenDigit[num / 10];// 39 /10---3
					}
					else if(p==1) {
						inWords = inWords +" "+ singleDigit[num];// 39 /10---3
							
					}
					num = num % p;// 83
					p= p/10;
				}
				
				System.out.println(inWords);
				
				/*if( (num >=0) && (num <10)) {
					inWords = singleDigit[num];
				}
				else if( (num >=10) && (num <20)) {
					inWords = twoDigit[num % 10];
				} 
				
				System.out.println(inWords);
				*/	
			}
		
	}


