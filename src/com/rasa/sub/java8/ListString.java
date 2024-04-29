package com.rasa.sub.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListString {

	public static void main(String[] args) {

		System.out.println("Find the unqiue value in list by using java 8");
		
		List<String> names = Arrays.asList("Suba", "Raka","moni", "Suba","hasni");
		List<String> unquieList = names.stream().distinct().collect(Collectors.toList());
		
		System.out.println("UnquieList" + unquieList);
	}

}
