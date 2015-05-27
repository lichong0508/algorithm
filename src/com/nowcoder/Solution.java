package com.nowcoder;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fbc = new Fibonacci();
		long startTime = System.currentTimeMillis();
		int target2 = fbc.recursion_solution(10);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		int target = fbc.Solution(30);
		System.out.println(target);
	}

}
