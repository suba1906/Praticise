package com.rasa.sub;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfList {

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(1, 2, 3, 4);

		System.out.println(a.stream().map(n -> n * n).collect(Collectors.toList()));
	}

}
