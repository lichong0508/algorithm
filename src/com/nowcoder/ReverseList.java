package com.nowcoder;

public class ReverseList {
	/**
	 * 翻转链表，返回头结点
	 * @param head
	 * @return
	 */
	public ListNode solution(ListNode head){
		if(head == null) return null;
        else {
            ListNode ptr1 = head;
            ListNode ptr2 = null;
            ListNode next = head;
            // 使用三个指针翻转链表
            while(next != null) {
                next = next.next;
                ptr1.next = ptr2;
                ptr2 = ptr1;
                ptr1 = next;
            }
            return ptr2;
        }
    }
}

