package com.leetcode.array.medium;

/**
 * https://leetcode.com/problems/longest-turbulent-subarray/
 * The comparisons are [1,1,-1,1,-1,0,-1,1] for [9,4,2,10,7,8,8,1,9] if -1, 0, 1 (for <, =, >)
 * 
 * @author Vai-Rogu
 *
 */
public class MaxTurbulenceSize {

	public static void main(String[] args) {

		int[] arr = new int[] { 170, 59, 129, 54, 5, 98, 129, 37, 58, 193 };
		System.out.println(maxTurbulenceSize(arr));
	}

	public static int maxTurbulenceSize(int[] A) {

		int[] size = new int[40000];
		int c = 0;
		for (int i = 0; i < A.length - 1; i++) {
			if ((i + 1) % 2 != 0) {
				if (A[i] < A[i + 1]) {
					size[c]++;
				} else {
					if (size[c] >= 1) {
						c++;
					}
				}
			} else {
				if (A[i] > A[i + 1]) {
					size[c]++;
				} else {
					if (size[c] >= 1) {
						c++;
					}
				}
			}
		}
		c++;

		for (int i = 0; i < A.length - 1; i++) {
			if ((i + 1) % 2 == 0) {
				if (A[i] < A[i + 1]) {
					size[c]++;
				} else {
					if (size[c] >= 1) {
						c++;
					}
				}
			} else {
				if (A[i] > A[i + 1]) {
					size[c]++;
				} else {
					if (size[c] >= 1) {
						c++;
					}
				}
			}
		}

		int max = size[0];
		for (int i = 1; i < size.length; i++) {
			if (size[i] > max) {
				max = size[i];
			}

		}

		return max + 1;

	}

}
