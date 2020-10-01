package com.leetcode.array.easy;

/**
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 * 
 * @author Vai-Rogu
 *
 */
public class SortArrayByParity2 {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 3, 5, 7, 2, 4, 6, 8 };
		arr = sortArrayByParityII(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static int[] sortArrayByParityII(int[] A) {
		int[] res = new int[A.length];
		int j = 0;
		int k = 1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				res[j] = A[i];
				j = j + 2;
			} else {
				res[k] = A[i];
				k = k + 2;
			}

		}

		return res;
	}

}
