package com.cognixia.jump.firstprogram;

public class ClassProblem {
	
	public static void main(String[] args)  {
		int x = 10;
		int y = 5;
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println(" x = " + x + ", y = " + y);
		
		
		String PalindromeString = "mom", reversePalindromeString = "";
		
		int PalindromeStringLength = PalindromeString.length();
		
		for(int i =(PalindromeStringLength - 1); i>=0; --i) {
		reversePalindromeString = reversePalindromeString + PalindromeString.charAt(i);
		System.out.println(PalindromeString);
		System.out.println(reversePalindromeString);
		
		
		}
		
		if("mom"== "mom") {
			System.out.println("Palindrome String and reverse Palindrome String is " + PalindromeString);
			
		}
		
		
		
		
		
		
		

		
		
		
		
			
	}
	
}
