package com.leetcode.array.easy;

/**
 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
 * 
 * @author Vai-Rogu
 *
 */
public class FindLucky {

	public static void main(String[] args) {

		int arr[] = new int[] { 7,7,7,7,7,7,7 };
		System.out.println(findLucky(arr));
	}

	public static int findLucky(int[] arr) {

		int[] space = new int[500];
		for (int a : arr) {
			space[a - 1]++;
		}

		int lucky = -1;
		for (int i = 0; i < space.length; i++) {
			if (space[i] == i + 1) {
				lucky = i + 1;
			}
		}

		return lucky;
	}

}
