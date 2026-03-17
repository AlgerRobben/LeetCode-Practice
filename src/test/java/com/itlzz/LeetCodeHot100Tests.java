package com.itlzz;


import com.itlzz.linkedlist.ListNode;
import com.itlzz.linkedlist.PalindromeLinkedList;
import org.junit.jupiter.api.Test;

public class LeetCodeHot100Tests {

    @Test
    public void test(){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        System.out.println(new PalindromeLinkedList().isPalindrome(head));
    }
}
