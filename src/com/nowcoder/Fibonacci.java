package com.nowcoder;

public class Fibonacci {
	/**
	 * 输入一个整数n，输出斐波那契数列的第n项。
	 * 相较于循环耗时更多
	 * @param n
	 * @return
	 */
	public int Solution(int n){
		if(n <= 0) return -1;
		if(n == 1){
			return 0;
		}else if(n == 2){
			return 1;
		}else{
			return Solution(n - 1) + Solution(n - 2);
		}
	}
	/**
	 * 循环
	 * 时间限制：1秒
	 * 空间限制：32768K
	 */
	public int recursion_solution(int n){
		if(n <= 0) return -1;
		if(n == 1){
			return 0;
		}else if(n == 2){
			return 1;
		}else{
			int one = 0;
			int two = 1;
			int target = 0;
			for(int i = 3; i <= n; i++){
				target = one + two;
				one = two;
				two = target;
			}
			return target;
		}	
	}
}
