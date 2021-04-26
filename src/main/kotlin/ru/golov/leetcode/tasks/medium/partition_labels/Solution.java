package ru.golov.leetcode.tasks.medium.partition_labels;

import java.util.List;
import java.util.ArrayList;

class Solution {

    public List<Integer> partitionLabels(String S) {
        var lastCharPosition = new int[26];
        
        for (int i = 0; i < S.length(); i++) {
            lastCharPosition[S.charAt(i) - 'a'] = i;    
        }
        
        var start = 0;
        var end = 0;
        var result = new ArrayList<Integer>();
        
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, lastCharPosition[S.charAt(i) - 'a']);
            
            if (i == end) {
                result.add(i - start + 1);
                start = i + 1;
            }
        }
        
        return result;
    }
}