package com.rasa.sub;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 6, 7 };

		String name = "suba lakshimi working in tcs";
		// tcs in working lakshimi suba

		System.out.println(Arrays.stream(name.split(" ")).reduce((a, b) -> (b + " " + a)).get());

		System.out.println(
				Arrays.stream(name.split(" ")).map(k -> new StringBuilder(k).reverse()).collect(Collectors.joining(" ")));

		System.out.println(Arrays.toString(Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).toArray()));
		Stack<Integer> s = new Stack<>();

		for (int a : arr) {
			s.push(a);
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.pop();
		}

		System.out.println(Arrays.toString(arr));
	}

}
