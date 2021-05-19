package ru.golov.leetcode.tasks.easy.group_nums;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    // f([1, 4, 6]) -> "1,4,6"
    // f([1, 2, 5]) -> "1-2,5"
    // f([1, 2, 5, 6]) -> "1-2,5-6"
    // f([1, 5, 6]) -> "1,5-6"
    public String convert(List<Integer> nums) {
        var sorted = nums.stream()
            .sorted()
            .collect(Collectors.toList());
        
        Integer start = null;
        Integer end = null;
        
        var result = new StringBuilder();
        
        for (int i = 0; i < nums.size(); i++) {
            if (start == null) {
                start = sorted.get(i);
                continue;
            }
            
            if (sorted.get(i) - sorted.get(i - 1) > 1) {
                if (end != null) {
                    result.append(start).append("-").append(end).append(",");
                } else {
                    result.append(start).append(",");
                }
                
                start = sorted.get(i);
                end = null;
            } else {
                end = sorted.get(i);
            }
        }
        
        if (end != null) {
            result.append(start).append("-").append(end);
        } else {
            result.append(start);
        }
        
        return result.toString();
    }
}