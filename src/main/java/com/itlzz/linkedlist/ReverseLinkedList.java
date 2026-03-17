package com.itlzz.linkedlist;

//leetcode 206.反转链表

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        int length = 0;
        while(curNode != null){
            length++;
            curNode = curNode.next;
        }
        return reverse(head, length);
    }

    public ListNode reverse(ListNode head, int length){
        if (length == 0){
            return null;
        }
        if(length == 1){
            head.next = null;
            return head;
        }
        ListNode tail = head;
        for (int i = 0; i < length - 1; i++) {
            tail = tail.next;
        }
        tail.next = reverse(head, length - 1);
        return tail;
    }
}
