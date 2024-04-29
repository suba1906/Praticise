package com.rasa.sub;

public class MaxDiffBetween {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 2, 90, 40 };

		int max = arr[0], min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			max = arr[i] > max ? arr[i] : max;
			min = arr[i] < min ? arr[i] : min;

		}

		System.out.println("max diff " + (max - min));

	}

}
