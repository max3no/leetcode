package com.easy.array.leetcode;

/**
 * https://leetcode.com/problems/sort-array-by-parity
 * @author Vai-Rogu
 *
 */
public class SortArrayByParity {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 4, 2, 7, 8, 1, 2, 3, 4, 6, 1, 5, 6, 7, 2, 8, 6, 4, 5 };
		arr = sortArrayByParity(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] sortArrayByParity(int[] A) {

		int i = 0;
		int j = A.length - 1;
		int temp = 0;

		while (i < j) {
			if (isEven(A[j])) {
				if (isOdd(A[i])) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
					j--;
					i++;
				} else {
					i++;
				}
			} else {
				j--;
			}
		}

		return A;

	}

	private static boolean isEven(int num) {
		return (num % 2 == 0) ? true : false;

	}

	private static boolean isOdd(int num) {
		return (num % 2 == 0) ? false : true;

	}

}
