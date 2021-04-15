package ru.golov.leetcode.tasks.easy.binary_search_algorithms.min_rotated_array

class Solution {

    /**
     *   f([1, 2, 3, 4, 5]) -> 1
     *   f([4, 5, 1, 2, 3]) -> 1
     *   f([5, 1, 2, 3, 4]) -> 1
     *   f([1]) -> 1
     *   f([2, 1]) -> 1
     *   f([2, 3, 4, 5, 1]) -> 1
     *
     */
    fun findMin(nums: IntArray): Int {
        if (nums.size == 1 || nums[0] < nums[nums.size - 1]) {
            return nums[0]
        }
        
        var left = 0
        var right = nums.size - 1
        
        while (left <= right) {
            val pivot = left + (right - left) / 2
            
            if (nums[pivot] > nums[pivot + 1]) {
                return nums[pivot + 1]
            }
            
            if (nums[pivot - 1] > nums[pivot]) {
                return nums[pivot]
            }
            
            if (nums[0] < nums[pivot]) {
                left = pivot + 1
            } else {
                right = pivot - 1
            }
        }
        
        return -1
    }
}