package com.itlzz.linkedlist;

//leetcode 234.回文链表

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode curNode = head;
        while(curNode != null){
            len++;
            curNode = curNode.next;
        }
        if(len == 1){
            return true;
        }
        curNode = head;
        ListNode node1 = curNode;
        ListNode node2 = curNode;
        for (int i = 0; i < len; i++) {
            if(i == (len - 1) / 2){
                node1 = curNode;
                curNode = curNode.next;
            } else if (i > (len - 1) / 2) {
                node2 = curNode.next;
                curNode.next = node1;
                node1 = curNode;
                if(node2 != null){
                    curNode = node2;
                }
            }else {
                curNode = curNode.next;
            }
        }
        ListNode tail = curNode;
        for (int i = 0; i < (len - 1) / 2; i++) {
            if(head.val != tail.val){
                return false;
            }
            tail = tail.next;
            head = head.next;
        }
        return tail.val == head.val;
    }
}
