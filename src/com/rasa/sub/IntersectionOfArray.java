package com.rasa.sub;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntersectionOfArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		int arr1[] = { 5, 4, 7, 9 };

		Set st = new HashSet();

		st = Arrays.stream(arr).boxed().map(Function.identity()).collect(Collectors.toSet());

		for (int a : arr1) {
			if (!st.add(a))
				System.out.println("intersection " + a);
		}
		Arrays.sort(arr);
		Arrays.sort(arr1);

		int start = 0;

		int end = arr1.length - 1;

		int j = 1;

		while (start <= end) {
			int com = arr.length - j;
			if (com >= 0) {
				if (arr[com] == arr1[end]) {
					System.out.println(arr[com]);
					break;
				} else if (arr[com] > arr1[end])
					j++;
				else
					end--;

			} else
				break;

		}

	}

}
