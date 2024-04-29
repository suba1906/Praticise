package com.rasa.sub;

import java.util.Arrays;
import java.util.Stack;

public class FindNextGreaterElement {

	public static void main(String[] args) {

		int arr[] = { 10, 11, 5, 4, 7 };

		Stack<Integer> s = new Stack<>();
		Stack<Integer> s1 = new Stack<>();

		s.push(-1);
		s1.push(arr[arr.length - 1]);

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > s1.peek()) {
				s.push(-1);
				s1.pop();
				s1.push(arr[i]);
			}
			else
			{
				s.push(s1.peek());

			}
		}
		
		//System.out.println(s);
		
		for(int i =0; i < arr.length; i++)
		{
			arr[i]=s.pop();
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
