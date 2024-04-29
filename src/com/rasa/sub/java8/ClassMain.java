package com.rasa.sub.java8;

public class ClassMain {

	public static void main(String[] args) {

		ClassA a = new ClassB();

		a.m1();
		// a.m2(); m2 method not thr in `class A so it will throw compile time error

	}

}
