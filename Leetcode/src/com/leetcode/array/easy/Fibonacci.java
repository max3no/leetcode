package com.leetcode.array.easy;

/**
 * https://leetcode.com/problems/fibonacci-number/
 * try binet formula for O(1)
 * @author Vai-Rogu
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fib(5));
	}

	public static int fib(int N) {
		if(N <= 1)
			return N;

		return mem(N);

	}
	
	public static int mem(int N) {
		int[] cache = new int[N+1];
		cache[1] = 1;
		
		for(int i = 2; i<=N ; i++) {
			cache[i] = cache[i-1] + cache[i-2];
		}
		return cache[N];
		
	}

}
