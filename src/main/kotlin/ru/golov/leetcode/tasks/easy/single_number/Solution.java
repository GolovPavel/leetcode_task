package ru.golov.leetcode.tasks.easy.single_number;

public class Solution {


    /**
     * a ^ 0 = a
     * a ^ a = 0
     * a ^ b ^ a = (a ^ a) ^ b = b
     */
    public int singleNumber(int[] nums) {
        var result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
