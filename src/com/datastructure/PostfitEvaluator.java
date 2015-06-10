package com.datastructure;

import java.util.Stack;
import java.util.StringTokenizer;

public class PostfitEvaluator {
	private final char ADD = '+';
	private final char SUB = '-';
	private final char MUL = '*';
	private final char DIV = '/';
	private Stack<Integer> stack;
	public PostfitEvaluator(){
		stack = new Stack<Integer>();
	}
	/**
	 * 利用栈计算后缀表达式
	 * @param expr
	 * @return
	 */
	public int evaluator(String expr){
		int op1, op2, result = 0;
		String token;
		StringTokenizer st = new StringTokenizer(expr);
		while(st.hasMoreTokens()){
			token = st.nextToken();
			if(isOperator(token)){
				op2 = stack.pop().intValue();
				op1 = stack.pop().intValue();
				result = eva(token.charAt(0), op1, op2);
				stack.push(result);
			}else{
				stack.push(new Integer(Integer.parseInt(token)));
			}
		}
		return result;
	}
	private int eva(char oper, int op1, int op2) {
		int result = 0;
		switch(oper){
		case ADD:
			result = op1 + op2;
			break;
		case SUB:
			result = op1 - op2;
			break;
		case MUL:
			result = op1 * op2;
			break;
		case DIV:
			result = op1 / op2;
			break;
		}
		return result;
	}
	private boolean isOperator(String token) {
		// TODO Auto-generated method stub
		return (token.equals("+") || token.equals("-") 
				|| token.equals("*") || token.equals("/"));
	}
	
}
