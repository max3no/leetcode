package com.leetcode.array.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/reduce-array-size-to-the-half/
 * 
 * @author Vai-Rogu
 *
 */
public class MinSetSize {

	public static void main(String[] args) {

		int[] arr = new int[] { 1,2,3,4,5,6,7,8,9,10 };

		System.out.println(minSetSize(arr));
	}

	public static int minSetSize(int[] arr) {
		int length = arr.length;
		int half = length/2;
		Map<Integer, Integer> frequency = new HashMap<>();
		for (int i = 0; i < length; i++) {
			if (frequency.containsKey(arr[i])) {
				int val = frequency.get(arr[i]);
				frequency.put(arr[i], val + 1);
			} else
				frequency.put(arr[i], 1);

		}
		Map<Integer, Integer> sortedFrequency = frequency.entrySet().stream()
				.sorted(Entry.<Integer, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		int freq = 0;
		int res = 0;
		for (Map.Entry<Integer, Integer> map : sortedFrequency.entrySet()) {
			if(length - freq > half) {
				freq = map.getValue() + freq;
				res++;
			} else {
				break;
			}
		}

		return res;
	}
}
