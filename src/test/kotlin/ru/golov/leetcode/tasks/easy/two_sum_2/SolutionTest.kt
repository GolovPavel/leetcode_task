package ru.golov.leetcode.tasks.easy.two_sum_2

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class SolutionTest {

    @Test
    fun maxProfitTest1() {
        val solution = Solution()
        val result = solution.twoSum(intArrayOf(2, 7, 11, 15), 9)

        assertTrue(intArrayOf(0, 1).contentEquals(result))
    }

    @Test
    fun maxProfitTest2() {
        val solution = Solution()
        val result = solution.twoSum(intArrayOf(2, 3, 4), 6)

        assertTrue(intArrayOf(0, 2).contentEquals(result))
    }

    @Test
    fun maxProfitTest3() {
        val solution = Solution()
        val result = solution.twoSum(intArrayOf(-1, 0), -1)

        assertTrue(intArrayOf(0, 1).contentEquals(result))
    }
}