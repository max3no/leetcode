package com.leetcode.array.easy;

/**
 * https://leetcode.com/problems/toeplitz-matrix/
 * 
 * @author Vai-Rogu
 *
 */
public class ToeplitzMatrix {

	public static void main(String[] args) {

		int arr[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } };
		System.out.println(isToeplitzMatrix(arr));

	}

	public static boolean isToeplitzMatrix(int[][] matrix) {

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (hasNeighbour(i, j)) {
					if (matrix[i][j] == matrix[i - 1][j - 1]) {
						continue;
					} else {
						return false;
					}
				}
			}
		}

		return true;
	}

	private static boolean hasNeighbour(int i, int j) {
		return i - 1 >= 0 && j - 1 >= 0;
	}

}
