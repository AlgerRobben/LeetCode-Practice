package com.itlzz.stack;

import java.util.Deque;
import java.util.LinkedList;

//leetcode 20.有效的括号

public class validbracket {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char c2 = stack.pop();
                if((c == ')' && c2 != '(') || (c == '}' && c2 != '{') || (c == ']' && c2 != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
