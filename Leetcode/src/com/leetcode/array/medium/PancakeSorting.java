package com.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/pancake-sorting/
 * 
 * @author Vai-Rogu
 *
 */
public class PancakeSorting {

	public static void main(String[] args) {
//		int[] arr = new int[] { 6, 3, 5, 7, 2, 1, 4 };
		int[] arr = new int[] { 1, 2, 3 };
		pancakeSort(arr).stream().forEach(a -> System.out.print(a + " "));

	}

	public static List<Integer> pancakeSort(int[] arr) {
		List<Integer> cakes = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> res = new ArrayList<>();

		int n = cakes.size();
		for (int i = 0; i < cakes.size(); i++) {
			if (cakes.get(i) == n) {
				res.add(i + 1);
				Collections.reverse(cakes.subList(0, i + 1));
				res.add(n);
				Collections.reverse(cakes.subList(0, n));
				i = -1;
				n--;
			}

		}

		return res;
	}

}
