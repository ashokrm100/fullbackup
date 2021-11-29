package com.JavaConcepts;

import java.util.ArrayList;

public class UniqueNumberArray {
	public static void main(String args[]) {
		int a[] = { 1, 5, 5, 4, 1, 4, 8, 9 };
		int k;
		ArrayList<Integer> ai = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			k = 0;
			if (!(ai.contains(a[i]))) {
				ai.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == (a[j])) {

						k++;

						
					}
				}
				System.out.println("Number in Array:" +a[i]);
				System.out.println("Number Occurance:" + k);
			}
		}
	}
}
