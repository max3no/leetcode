package com.leetcode.array.easy;

/**
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 * 
 * @author Vai-Rogu
 *
 */
public class KWeakestRows {

	public static void main(String[] args) {

//		int[][] arr = new int[][] { { 1, 1, 0, 0, 0 }, 
//			{ 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 },
//				{ 1, 1, 1, 1, 1 } };

		int[][] arr = new int[][] { { 1, 0 }, { 1, 0 }, { 1, 0 }, { 1, 1 }

		};
		int[] res = kWeakestRows(arr, 3);
		for (int r : res)
			System.out.print(r + " ");
	}

	public static int[] kWeakestRows(int[][] mat, int k) {

		int[] res = new int[mat.length];
		int[] result = new int[k];
		int s = 0;
		for (int i = 0; i < mat.length; i++) {
			s = 0;
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 1) {
					s++;
				} else
					break;
			}
			res[i] = s;
		}

		for (int i = 0; i < k; i++) {
			int min = res[0];
			int index = 0;
			for (int j = 1; j < res.length; j++) {
				if (res[j] < min) {
					min = res[j];
					index = j;
				}
			}
			res[index] = 1000;
			result[i] = index;
		}

		return result;
	}

}
