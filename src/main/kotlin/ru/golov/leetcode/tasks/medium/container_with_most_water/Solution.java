package ru.golov.leetcode.tasks.medium.container_with_most_water;

class Solution {

    public int maxArea(int[] height) {
        var start = 0;
        var end = height.length - 1;
        var maxArea = 0;

        while (start < end) {
            maxArea = Math.max(maxArea, Math.min(height[start], height[end]) * (end - start));

            if (height[end] < height[start]) {
                end--;
            } else {
                start++;
            }
        }

        return maxArea;
    }
}
