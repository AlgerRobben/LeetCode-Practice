package com.itlzz.tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


//leetcode 94.二叉树的中序遍历
//leetcode 102.二叉树的层序遍历

public class TreeTraversal {

    //递归写法
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new LinkedList<>();
        if(root == null){
            return lst;
        }else {
            lst.addAll(inorderTraversal(root.left));
            lst.add(root.val);
            lst.addAll(inorderTraversal(root.right));
        }
        return lst;
    }

    //遍历写法利用栈
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> lst = new LinkedList<>();
        if(root == null){
            return lst;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode curNode;
        stack.push(root);
        while(!stack.isEmpty()){
            curNode = stack.peek();
            if (curNode.left != null){
                stack.push(curNode.left);
                //入栈后断开，以防重复进栈
                curNode.left = null;
            }else {
                lst.add(stack.pop().val);
                if(curNode.right != null){
                    stack.push(curNode.right);
                    curNode.right = null;
                }
            }
        }
        return lst;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        return null;
    }


}
