package com.leetcode.array.medium;

/**
 * https://leetcode.com/problems/flipping-an-image/
 * 
 * @author Vai-Rogu
 *
 */
public class FlippingAnImage {

	public static void main(String[] args) {

		int[][] arr = { {1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		arr = flipAndInvertImage(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] flipAndInvertImage(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length / 2; j++) {
				int temp = flip(A[i][j]);
				A[i][j] = flip(A[i][A.length - j - 1]);
				A[i][A.length - j - 1] = temp;
			}
			if (A.length % 2 != 0)
				A[i][(A.length / 2) ] = flip(A[i][(A.length / 2) ]);
		}
		return A;

	}

	private static int flip(int bit) {
		if (bit == 0)
			return 1;
		else
			return 0;
	}

}
