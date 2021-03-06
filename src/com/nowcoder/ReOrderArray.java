package com.nowcoder;

public class ReOrderArray {
	/**
	 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
	 * 使得所有的奇数位于数组的前半部分，
	 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
	 * @param array
	 */
	public void solution(int[] array){
		int temp, j;
		for(int i = 1; i < array.length; i++){
			temp = array[i];
			for(j = i; j > 0 && (array[j]%2 != 0) && (array[j-1]%2 == 0) ; j--){
				temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
			}
		}
	}
}
