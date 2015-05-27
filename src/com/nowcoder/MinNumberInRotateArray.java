package com.nowcoder;

public class MinNumberInRotateArray {
	public int solution(int[] array){
		if(array.length == 0)
			return 0;
		if(array.length == 1)
			return array[0];
		for(int i = 0; i < array.length-1; i++){
			if(array[i] > array[i+1])
				return array[i+1];
		}
		return array[0];
	}

}
