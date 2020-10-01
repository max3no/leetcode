package com.leetcode.array.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * 
 * @author Vai-Rogu
 *
 */
public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr = new int[] { 1,1,2,2,3,3,4,4,5,6 };
		List<Integer> arrays = findDuplicates(arr);
		for (int a : arrays)
			System.out.print(a + " ");

	}

	public static List<Integer> findDuplicates(int[] nums) {

		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[Math.abs(nums[i]) - 1] > 0)
				nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
			else
				arr.add(Math.abs(nums[i]));

		}

		return arr;

	}
}
