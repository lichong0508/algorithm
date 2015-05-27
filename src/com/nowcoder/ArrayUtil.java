package com.nowcoder;


public class ArrayUtil {

	/**
	 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
	 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
	 * @param args
	 */
	public static void main(String[] args) {
		int array[][] = {{3,5,7,9},{4,6,8,10},{8,9,10,12},{9,10,11,13},{15,17,19,20}};
 		ArrayUtil util = new ArrayUtil();
		System.out.println(util.Find(array, 0));
	}
	public boolean Find(int[][] array,int target){
		int column = 0;
		int row = array.length - 1;
		while(array[row].length > 0 && array[row][column] > target){
			row--;
			if(row < 0){
				return false;
			}
		}
		while(row >= 0){
			for(column = 0; column < array[row].length; column++){
				if(target == array[row][column]){
					return true;
				}
			}
			row--;
		}
		
		return false;
	}

}
