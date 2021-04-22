package ru.golov.leetcode.tasks.medium.search_rotated_sorted_array_2;

class Solution {

    // f([], 0)
    // f([1], 1)
    // f([1], 2)
    // f([3, 4, 5, 1, 2], 4)
    // f([3, 4, 5, 1, 2], 1)
    // f([3, 4, 1, 2], 2)
    // f([3, 4, 1, 2], 3)
    // f([1, 3, 1, 1], 3)
    public boolean search(int[] nums, int target) {
        var start = 0;
        var end = nums.length - 1;
        
        while (start <= end) {
            var mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                return true;
            }
            
            if (nums[mid] > nums[start]) {
                if(nums[mid] > target && nums[start] <= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < nums[start]) {
                if(nums[mid] < target && nums[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                start++;
            }
        }
        
        return false;
    }
}