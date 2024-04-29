package com.rasa.sub;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {

		int arr[] = { 10, 0, 0, 20, 40, 50, 60 };

		int arr1[] = new int[arr.length];
		Arrays.fill(arr1, 0);
		int start = 0;

		for (int a : arr) {
			// System.out.println(a);
			if (a != 0)
				arr1[start++] = a;

		}

		System.out.println(Arrays.toString(arr1));
	}

}
