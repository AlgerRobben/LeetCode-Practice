package com.itlzz.slidingwindow;

import java.util.HashSet;
import java.util.Set;

//leetcode 3.无重复字符的最长字串

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        if(s.isEmpty()){
            return ans;
        }else {
            int i = 0;
            int j = 0;
            Set<Character> set = new HashSet<>();
            while(j < s.length()){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    ans = Math.max(ans, j - i + 1);
                    j++;
                }else{
                    while(s.charAt(i) != s.charAt(j)){
                        set.remove(s.charAt(i));
                        i++;
                    }
                    set.remove(s.charAt(i));
                    i++;
                }
            }
        }
        return ans;
    }
}
