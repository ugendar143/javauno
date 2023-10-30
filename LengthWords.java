package com.unocarrier;

public class LengthWords {

	public static void main(String[] args) {
        String str = "Hello Friends Good morning And Good Morning Nalgonda";
		
		String[] res = str.split(" ");
		
		for(int i=0;i<res.length;i++) {
			if(res[i].length() %1 == 0) {
				System.out.println(res[i]);	
			}
			
		}
	}

}
