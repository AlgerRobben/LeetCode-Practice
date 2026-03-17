package com.itlzz.linkedlist;

//leetcode 141.环形链表

public class LinkedListCycle {

    //利用node.val数值范围限制进行访问标记

    public boolean hasCycle(ListNode head) {
        ListNode curNode = head;
        while(curNode != null){
            if(curNode.val == 100001){
                return true;
            }else {
                curNode.val = 100001;
                curNode = curNode.next;
            }
        }
        return false;
    }
}
