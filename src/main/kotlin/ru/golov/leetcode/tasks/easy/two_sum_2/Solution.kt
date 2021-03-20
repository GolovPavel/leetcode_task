package ru.golov.leetcode.tasks.easy.two_sum_2

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        for (i in numbers.indices) {
            val remaining = target - numbers[i]
            val remainingIndex = numbers.binarySearch(remaining, i + 1)

            if (remainingIndex != -1) {
                return intArrayOf(i, remainingIndex)
            }
        }

        return intArrayOf()
    }
}