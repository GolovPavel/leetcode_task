package ru.golov.leetcode.tasks.easy.binary_search

class Solution {

    fun search(nums: IntArray, target: Int): Int {        
        var start = 0
        var end = nums.size - 1
        var pivot = 0
        
        while (start <= end) {
            pivot = start + (end - start) / 2
            
            if (nums[pivot] == target) {
                return pivot
            } else if (nums[pivot] > target) {
                end = pivot - 1
            } else {
                start = pivot + 1
            }
        }
        
        return -1
    }
}