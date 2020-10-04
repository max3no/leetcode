package com.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/shift-2d-grid/
 * 
 * @author Vai-Rogu
 *
 */
public class ShiftGrid {

	public static void main(String[] args) {

		int arr[][] = new int[][] { {3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13} };
		List<List<Integer>> res = shiftGrid(arr, 4);
		for (List<Integer> r : res) {
			for (Integer a : r) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	public static List<List<Integer>> shiftGrid(int[][] grid, int k) {

		int dummy[] = new int[grid.length * grid[0].length];
		int c = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				dummy[c++] = grid[i][j];
			}
		}

		for (int r = 0; r < k; r++) {
			int a = dummy[0];
			for (int i = 0; i < dummy.length - 1; i++) {
				int val = dummy[i + 1];
				dummy[i + 1] = a;
				a = val;
			}
			dummy[0] = a;
		}

		List<List<Integer>> res = new ArrayList<>();
		c = 0;
		for (int j = 0; j < grid.length; j++) {
			List<Integer> r = new ArrayList<>();
			for (int i = 0; i < grid[0].length; i++) {
				r.add(dummy[c++]);
			}
			res.add(r);
		}

		return res;
	}

}
