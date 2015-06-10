package com.datastructure;

import java.util.Scanner;

public class Postfit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression, again;
		int result = 0;
		try {
			Scanner in = new Scanner(System.in);
			do {
				PostfitEvaluator pe = new PostfitEvaluator();
				System.out.println("输入后缀表达式：");
				expression = in.nextLine();

				result = pe.evaluator(expression);
				System.out.println();
				System.out.print("是否继续（Y/N）：");
				again = in.nextLine();
				System.out.println();
			} while (again.equalsIgnoreCase("y"));
		} catch (Exception e) {
			System.out.println("输入有误！");
		}
		System.out.println(result);
	}

}
