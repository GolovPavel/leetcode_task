package ru.golov.leetcode.tasks.easy.two_sum_2

class Solution {
    fun twoSumBinarySearch(numbers: IntArray, target: Int): IntArray {
        for (i in numbers.indices) {
            val remaining = target - numbers[i]
            val remainingIndex = numbers.binarySearch(remaining, i + 1)

            if (remainingIndex != -1) {
                return intArrayOf(i, remainingIndex)
            }
        }

        return intArrayOf()
    }

    fun twoSumTwoPointers(numbers: IntArray, target: Int): IntArray {
        var firstPointer = 0;
        var secondPointer = numbers.size - 1

        while (firstPointer < secondPointer) {
            val sum = numbers[firstPointer] + numbers[secondPointer]

            when {
                sum > target -> {
                    secondPointer--
                }
                sum < target -> {
                    firstPointer++
                }
                else -> {
                    return intArrayOf(firstPointer, secondPointer)
                }
            }
        }

        return intArrayOf(-1, -1)
    }
}