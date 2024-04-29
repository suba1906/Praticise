package com.rasa.sub;

import java.util.Arrays;

public class SquareAndSortedArray {

	public static void main(String[] args) {

		int arr[] = { -6, -1, 2, 4, 5, 7 };

		System.out.println(
				Arrays.toString(Arrays.stream(arr).map(a -> Math.abs(a * a)).sorted().boxed().toArray(Integer[]::new)));

		// System.out.println(arr1.unboxed());
	}

}
