package ru.golov.leetcode.tasks.medium.four_sum;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        var result = new ArrayList<List<Integer>>();
        
        for (int a = 0; a < nums.length - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            
            for (int b = a + 1; b < nums.length - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) {
                    continue;
                }
                
                var c = b + 1;
                var d = nums.length - 1;
                
                while (c < d) {
                    var sum = nums[a] + nums[b] + nums[c] + nums[d];
                    
                    if (sum == target) {
                        result.add(List.of(nums[a], nums[b], nums[c], nums[d]));
                        c++;
                        
                        while (c < d && nums[c] == nums[c - 1]) {
                            c++;
                        }
                    } else if (sum < target) {
                        c++;
                    } else {
                        d--;
                    }
                }
            }
        }
        
        return result;
    }
}