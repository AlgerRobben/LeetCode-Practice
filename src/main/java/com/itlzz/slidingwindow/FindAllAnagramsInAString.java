package com.itlzz.slidingwindow;

import java.util.ArrayList;
import java.util.List;

//leetcode 438. 找到字符串中所有字母异位词

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        int sLength = s.length();
        int pLength = p.length();
        if(sLength < pLength){
            return new ArrayList<Integer>();
        }
        int[] differs = new int[26];
        for (int i = 0; i < pLength; i++) {
            differs[p.charAt(i) - 'a']++;
            differs[s.charAt(i) - 'a']--;
        }
        int differCnt = 0;
        for (int i = 0; i < 26; i++) {
            if(differs[i] != 0){
                differCnt++;
            }
        }
        List<Integer> results = new ArrayList<>();
        if(differCnt == 0){
            results.add(0);
        }
        for (int i = 0; i < sLength - pLength; i++) {
            differs[s.charAt(i) - 'a']++;
            if(differs[s.charAt(i) - 'a'] == 1){
                differCnt++;
            }
            if(differs[s.charAt(i) - 'a'] == 0){
                differCnt--;
            }
            differs[s.charAt(i + pLength) - 'a']--;
            if(differs[s.charAt(i + pLength) - 'a'] == 0){
                differCnt--;
            }
            if(differs[s.charAt(i + pLength) - 'a'] == -1){
                differCnt++;
            }
            if (differCnt == 0){
                results.add(i + 1);
            }
        }
        return results;
    }
}
