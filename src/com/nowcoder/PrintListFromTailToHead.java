package com.nowcoder;

import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {
	
	/**
	 * 栈方式：输入一个链表，从尾到头打印链表每个节点的值。返回新链表
	 * @param listNode
	 * @return ArrayList<Integer>
	 */
	public ArrayList<Integer> Stack_Solution(ListNode listNode){
		Stack<ListNode> stack = new Stack<ListNode>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(listNode != null){
			stack.push(listNode);
			listNode = listNode.next;
		}
		while(!stack.empty()){
			int val = stack.peek().val;
			arr.add(val);
			stack.pop();
		}
		return arr;
	}
	/**
	 * 递归方式
	 * @param listNode
	 * @return
	 */
	public ArrayList<Integer> Recursion_Solution(ListNode listNode) {
        
        if(listNode==null)
        {
            ArrayList<Integer> list = new ArrayList<Integer>();
            return list;
        }
        if (listNode.next != null)
        {
            ArrayList<Integer> list = Recursion_Solution(listNode.next);
            list.add(listNode.val);
            return list;
        }
        else
        {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(listNode.val);
            return list;
        }
    }
}
