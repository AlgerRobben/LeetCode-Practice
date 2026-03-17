package com.itlzz.linkedlist;

//leetcode 21.合并两个有序链表

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode curNode = head;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                curNode.next = p1;
                p1 = p1.next;
            }else {
                curNode.next = p2;
                p2 = p2.next;
            }
            curNode = curNode.next;
        }
        while(p1 != null){
            curNode.next = p1;
            p1 = p1.next;
            curNode = curNode.next;
        }
        while(p2 != null){
            curNode.next = p2;
            p2 = p2.next;
            curNode = curNode.next;
        }
        return head.next;
    }

}
