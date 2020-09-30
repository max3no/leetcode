package com.leetcode.array.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/array-partition-i/
 * 
 * @author Vai-Rogu
 *
 */
public class ArrayPartition1 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 4, 3, 2, 5, 9, 6, 11 };
		System.out.println(arrayPairSum(arr));

	}

	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length - 1; i = i + 2) {
			sum = sum + Math.min(nums[i], nums[i + 1]);
		}

		return sum;
	}

}
