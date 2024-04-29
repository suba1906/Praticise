package com.rasa.sub;

public class FindSumPair {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };

		int sum = 50;

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int total = arr[start] + arr[end];
			if (total == sum) {
				System.out.println("pair  -->  " + arr[start] + " " + arr[end]);
				start++;
				end--;
			} else if (total > sum)
				end--;
			else
				start++;
		}

	}

}
