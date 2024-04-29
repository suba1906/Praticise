package com.rasa.sub;

import java.util.Arrays;
import java.util.List;

public class Panagram {

	public static void main(String[] args) {

		List<String> alpha = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
				"p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

		String l = "the quick brown fox jumps over the lazy dog";

		if (l.length() < 26)
			System.out.println("not paragram");

		for (int i = 0; i < alpha.size(); i++) {
			if (!l.contains(alpha.get(i))) {
				System.out.println("not panagram");
				break;
			}
		}

		System.out.println("panagram");
	}

}
