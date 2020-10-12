package com.leetcode.array.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3 };
		List<List<Integer>> res = subsets(arr);
		for (List<Integer> i : res) {
			for (Integer a : i) {
				System.out.print(a + ",");
			}
			System.out.println();
		}

	}

	public static List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> res = new ArrayList<>();
		res.add(new ArrayList<>());

		for (int num : nums) {
			List<List<Integer>> i = new ArrayList<>();			
			for (List<Integer> l : res) {
				i.add(new ArrayList<Integer>(l) {{add(num);}});
			}
			for(List<Integer> l : i) {
				res.add(l);
			}
		}

		return res;
	}

}
