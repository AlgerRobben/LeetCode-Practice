package com.itlzz.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//LeetCode 49. 字母异位词分组

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> resultMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            Map<Character, Integer> cntMap = new HashMap<>();
            //1. 统计一个字符串中各个字母的个数
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                int cnt = cntMap.getOrDefault(c, 1) + 1;
                cntMap.put(c, cnt);
            }
            //2. 将统计结果整合成map的key作为分组标志
            String key = "";
            for(char c = 'a'; c <= 'z'; c++){
                key = key + c + cntMap.getOrDefault(c, 0);
            }
            //3. 根据存入resultMap中对应的list
            ArrayList<String> list = resultMap.getOrDefault(key, new ArrayList<String>());
            list.add(s);
            resultMap.put(key, list);
        }
        return new ArrayList<>(resultMap.values());
    }
}
