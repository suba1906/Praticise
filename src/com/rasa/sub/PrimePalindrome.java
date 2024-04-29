package com.rasa.sub;

public class PrimePalindrome {

	public static void main(String[] args) {
		
		int a = 131;
		int palindrome= 0;
		
		while(a>0)
		{
			int rem = a%10;
			palindrome = palindrome*10+rem;
			a=a/10;
		}
		System.out.println("palindrome" + palindrome);
			

	}

}
