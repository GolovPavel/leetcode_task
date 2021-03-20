package ru.golov.leetcode.tasks.easy.two_sum;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> numsMap = IntStream.range(0, nums.length).boxed()
                .collect(Collectors.groupingBy(i -> nums[i]));

        for (int i = 0; i < nums.length; i++) {
            var remainder = target - nums[i];

            if (numsMap.containsKey(remainder)) {
                var reminderIndexes = numsMap.get(remainder);

                for (Integer reminderIndex : reminderIndexes) {
                    if (i != reminderIndex) {
                        return new int[]{i, reminderIndex};
                    }
                }
            }
        }

        return new int[0];
    }
}
