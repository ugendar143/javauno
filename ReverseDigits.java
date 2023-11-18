package uno.career;

public class ReverseDigits {

	public static void main(String[] args) {
		int n=87621,r,reverse=0;
        while(n >0) {
        	r=n%10;
         reverse =reverse*10+r; 
         n=n/10;
	}
   System.out.println(reverse);
	}
}