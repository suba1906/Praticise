package com.rasa.sub;

public class ReverseTheWord {

	public static void main(String[] args) {

		String s = "india is my country";

		String a[] = s.split("\\s");
		String ans = "";

		for (int i = a.length - 1; i >= 0; i--) {
			// System.out.println(a[i]);
			ans += a[i];
			if (i != 0)
				ans += " ";
		}

		System.out.println(ans);
	}

}
