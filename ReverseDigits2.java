package uno.career;

public class ReverseDigits2 {

	public static void main(String[] args) {
	     String  str="67342";
	     char [] charArray =str.toCharArray();
	     String res=" ";
	    for(int i=charArray.length-1;i>=0;i--) {
	    	res= res +charArray[i];
	    }
	    System.out.println(res);
	}
}
 