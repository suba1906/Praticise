package com.rasa.sub.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumofNumber {
	public static void main(String[] args) {

		System.out.println("Sum of numbers by using java 8");
		
		int sum = IntStream.range(0, 50).sum();
		System.out.println(sum);
	}
}
