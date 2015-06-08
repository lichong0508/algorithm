package com.nowcoder;

public class Power {
	/**
	 * 给定一个double类型的浮点数base和int类型的整数exponent。
	 * 求base的exponent次方
	 * @param base
	 * @param exponent
	 * @return
	 */
	double solution(double base, int exponent){
		double result = 1.0;
		if(exponent == 0){
			return result;
		}else if(exponent < 0){
			for(int i = 0; i < -exponent; i++){
				result *= base;
			}
			return 1.0/result;
		}else{
			for(int i = 0; i < exponent; i++){
				result *= base;
			}
			return result;
		}
	}
}
