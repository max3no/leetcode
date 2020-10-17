package com.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/
 * 
 * @author Vai-Rogu
 *
 */
public class CombinationSum {

	public static void main(String[] args) {

		List<List<Integer>> sum = combinationSum(new int[] { 2, 3, 6, 7 }, 7);
		for (List<Integer> s : sum) {
			for (Integer a : s)
				System.out.print(a + " ");
			System.out.println();
		}
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(candidates);

		List<Integer> candidatesList = new ArrayList<>();
		findCandidates(result, candidatesList, candidates, target, 0);

		return result;

	}

	public static void findCandidates(List<List<Integer>> result, List<Integer> candidateList, int[] candidates,
			int target, int start) {

		if (target == 0) {
			result.add(new ArrayList<>(candidateList));
			return;
		}

		for (int i = start; i < candidates.length; i++) {
			if(candidates[i] > target) 
				break;
			
			candidateList.add(candidates[i]);
			findCandidates(result, candidateList, candidates, target-candidates[i], i);
			candidateList.remove(candidateList.size() - 1);
		}

	}

}
