package com.nowcoder;

public class FindKthToTail {
	/**
	 * 输入一个链表，输出该链表中倒数第k个结点
	 * @param head
	 * @param k
	 * @return
	 */
	public ListNode solution(ListNode head, int k){
		if(head == null || k <= 0) return null;
		ListNode kNode = null;
		ListNode first = head;
		for(int i = 0; i <= k - 1; i++){
			if(first.next != null){
				first = first.next;
			}else{
				return null;
			}
		}
        kNode = head;
		while(first.next != null){
			first = first.next;
			kNode = kNode.next;
		}
		return kNode;
	}
}
