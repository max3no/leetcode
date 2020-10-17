package com.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/combination-sum-iii/
 * 
 * @author Vai-Rogu
 *
 */
public class CombinationSum3 {

	public static void main(String[] args) {
		List<List<Integer>> sum = combinationSum3(9, 45);
		for (List<Integer> s : sum) {
			for (Integer a : s)
				System.out.print(a + " ");
			System.out.println();
		}
	}

	public static List<List<Integer>> combinationSum3(int k, int n) {
		int[] candidates = new int[9];
		for (int i = 0; i < 9; i++)
			candidates[i] = i+1;

		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(candidates);

		List<Integer> candidatesList = new ArrayList<>();
		findCandidates(result, candidatesList, candidates, n, 0);
		result = result.stream().filter(l -> l.size() == k).collect(Collectors.toList());

		return result;

	}

	public static void findCandidates(List<List<Integer>> result, List<Integer> candidateList, int[] candidates,
			int target, int start) {

		if (target == 0) {
			result.add(new ArrayList<>(candidateList));
			return;
		}

		for (int i = start; i < candidates.length; i++) {
			if (i != start && candidates[i] == candidates[i - 1])
				continue;
			if (candidates[i] > target)
				break;

			candidateList.add(candidates[i]);
			findCandidates(result, candidateList, candidates, target - candidates[i], i + 1);
			candidateList.remove(candidateList.size() - 1);
		}

	}

}
