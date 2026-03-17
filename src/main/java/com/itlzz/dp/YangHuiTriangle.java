package com.itlzz.dp;

import java.util.LinkedList;
import java.util.List;

//leetcode 70.杨辉三角

public class YangHuiTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new LinkedList<>();
            for (int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i){
                    row.add(1);
                }else {
                    row.add(triangle.get(i - 1).get(j) + triangle.get(i - 1).get(j - 1));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

}
