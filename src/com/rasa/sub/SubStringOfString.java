package com.rasa.sub;

public class SubStringOfString {

	public static void main(String[] args) {

		String a = "abc";

		for (int i = 0; i < a.length(); i++) {
			String b = "";
			for (int j = i; j < a.length(); j++) {
				b = b + a.charAt(j);
				System.out.println(b);
			}
		}
	}

}
