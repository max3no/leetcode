package com.leetcode.array.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * 
 * @author Vai-Rogu
 *
 */
public class SortedSquares {

	public static void main(String[] args) {
		int[] arr = new int[] { -4, -1, 0, 3, 10 };
		arr = sortedSquares(arr);
		for (int a : arr)
			System.out.print(a + " ");
	}

	public static int[] sortedSquares(int[] A) {
		int arr[] = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			arr[i] = A[i] * A[i];
		}
		Arrays.sort(arr);
		return arr;
	}

}
