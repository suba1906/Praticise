package com.rasa.sub;

public class ContinuousSuubSequence {

	public static void main(String[] args) {

		String a = "1 2 3 5 9 a 6 7 8 4 @ -5 -7 -3 -2 -1";

		String arr[] = a.split(" ");
		String ans = "";

		for (int i = 0; i < a.length() - 1; i++) {

			if (a.charAt(i) == ' ')
				continue;
			if (Character.isDigit(a.charAt(i))) {
				 System.out.println("char" + a.charAt(i));

				if (ans.isEmpty()) {
					 System.out.print(" isEmpty" + a.charAt(i));
					ans = ans + a.charAt(i);
					 System.out.print(" ans" + ans);

				} else {

					if (Integer.parseInt(a.charAt(i) + "") == Integer.parseInt(ans.charAt(ans.length() - 1) + "") + 1) {
						 System.out.println(" inside");

						ans = ans + a.charAt(i);

					} else {
						if (ans.length() > 1)
							System.out.print(ans);
						ans = "" + a.charAt(i);
						System.out.println(" ");

					}
				}

			}

		}

	}

}
