package com.leetcode;
/*
 * 一个数组中只有一个数字出现一次，其他均出现两次，求出该数字
 */
public class SingleNum {
	public static void main(String args[]){
		int[] A = {5,3,5,4,3,2,4};
		SingleNum s = new SingleNum();
		int result =  s.SingleNumber(A);
		System.out.println("result="+result);
	}
	public int SingleNumber(int[] A){
		int result = 0;
		for(int i=0;i<A.length;i++){
			result = result^A[i];
			}
		return result;
	}

}
