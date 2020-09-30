package com.leetcode.array.medium;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/reveal-cards-in-increasing-order/
 * 
 * @author Vai-Rogu
 *
 */
public class RevealCards {

	public static void main(String[] args) {
//		int[] arr = { 13, 2, 7, 9, 1, 17, 3, 4, 12 };
//		int[] arr = { 13, 2, 7, 9, 1, 17, 3, 4 };
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		arr = deckRevealedIncreasing(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static int[] deckRevealedIncreasing(int[] deck) {
		Arrays.sort(deck);
		Deque<Integer> dq = new LinkedList<>();

		dq.offerLast(deck[deck.length - 1]);
		for (int i = deck.length - 2; i >= 0; i--) {
			int lastCard = dq.pollLast();
			dq.offerFirst(lastCard);
			dq.offerFirst(deck[i]);
		}
		return dq.stream().mapToInt(card -> card).toArray();

	}

}
