package com.itlzz.linkedlist;

import java.util.HashSet;
import java.util.Set;

//leetcode 160.相交链表

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode curNode = headA;
        while(curNode != null){
            set.add(curNode);
            curNode = curNode.next;
        }
        curNode = headB;
        while(curNode != null){
            if(set.contains(curNode)){
                return curNode;
            }
            curNode = curNode.next;
        }
        return null;
    }
}
