package uno.career;

public class Palindrome {

	public static void main(String[] args) {
		int n=12678;
		int r,sum=0;
		int temp;
		temp=n;
		while(n>10) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Is  not a palindrome");
		}else {
			System.out.println("Is a palindeome");
		}
			}

}
