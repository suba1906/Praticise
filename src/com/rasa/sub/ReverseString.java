package com.rasa.sub;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {

		String a = "suba";
		String ans = "";
		System.out.println(new StringBuffer(a).reverse());
		StringJoiner jnr = new StringJoiner("");
		//Replace word
		System.out.println(Stream.of(a).map(word -> word.replace("b", "k")).collect(Collectors.joining("")));

		
		//reverse the string
		System.out.println(Stream.of(a).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining("")));
		System.out.println(a.chars().mapToObj(c -> (char) c).reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1));
		System.out.println(a.chars().mapToObj(c -> (char) c).allMatch( c -> Character.isDigit(c)));

		// System.out.println(ans2);
		/*
		 * for (String ch : a.split("")) { ans = ch + ans;
		 * 
		 * }
		 * 
		 * for (char ch : a.toCharArray()) { ans = ch + ans;
		 * 
		 * } System.out.println(ans);
		 */

		System.out.println(reverse(a, ans));
	}

	private static String reverse(String a, String ans) {

		if (a.length() <= 0)
			return ans;

		char ch = a.charAt(0);
		// System.out.println(ch);

		return reverse(a.substring(1), ch + ans);
	}

}
