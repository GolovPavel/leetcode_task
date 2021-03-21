package ru.golov.leetcode.tasks.medium.three_sum

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.size < 3) {
            return emptyList()
        }

        nums.sort()
        val res = mutableListOf<List<Int>>()

        for (x in nums.indices) {
            if (x > 0 && nums[x] == nums[x - 1]) {
                continue
            }

            var left = x + 1
            var right = nums.size - 1

            while (left < right) {
                val threeSum = nums[x] + nums[left] + nums[right]

                when {
                    threeSum < 0 -> {
                        left++
                    }
                    threeSum > 0 -> {
                        right--
                    }
                    else -> {
                        res.add(listOf(nums[x], nums[left], nums[right]))
                        left++

                        while (nums[left] == nums[left - 1] && left < right) {
                            left++
                        }
                    }
                }
            }
        }

        return res
    }
}