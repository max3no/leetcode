package com.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
 * 
 * @author Vai-Rogu
 *
 */
public class MoveChiips {

	public static void main(String[] args) {

		int[] arr = new int[] { 1 };
		System.out.println(minCostToMoveChips(arr));

	}

	public static int minCostToMoveChips(int[] position) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 0);
		map.put(1, 0);
		for (int pos : position) {
			if (pos % 2 == 0)
				map.put(0, map.get(0) + 1);
			else
				map.put(1, map.get(1) + 1);
		}
		return (Math.min(map.get(0), map.get(1)));

	}

}
