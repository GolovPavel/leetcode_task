package ru.golov.leetcode.tasks.medium.search_rotated_sorted_array;

class Solution {

    public int search(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;

        while (left <= right) {
            var pivot = left + (right - left) / 2;

            if (nums[pivot] == target) {
                return pivot;
            } else if (nums[pivot] < nums[left]) {
                if (target > nums[pivot] && target <= nums[right]) {
                    left = pivot + 1;
                } else {
                    right = pivot - 1;
                }
            } else {
                if (target < nums[pivot] && target >= nums[left]) {
                    right = pivot - 1;
                } else {
                    left = pivot + 1;
                }
            }
        }

        return -1;
    }
}