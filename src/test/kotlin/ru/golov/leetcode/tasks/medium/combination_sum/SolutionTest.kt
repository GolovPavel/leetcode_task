package ru.golov.leetcode.tasks.medium.combination_sum

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun combinationSumTest1() {
        val result = Solution().combinationSum(intArrayOf(2, 3, 6, 7), 7)
        assertEquals(listOf(listOf(2, 2, 3), listOf(7)), result)
    }

    @Test
    fun combinationSumTest2() {
        val result = Solution().combinationSum(intArrayOf(2, 3, 5), 8)
        assertEquals(listOf(listOf(2, 2, 2, 2), listOf(2, 3, 3), listOf(3, 5)), result)
    }

    @Test
    fun combinationSumTest3() {
        val result = Solution().combinationSum(intArrayOf(1), 1)
        assertEquals(listOf(listOf(1)), result)
    }

    @Test
    fun combinationSumTest4() {
        val result = Solution().combinationSum(intArrayOf(1), 2)
        assertEquals(listOf(listOf(1, 1)), result)
    }

    @Test
    fun combinationSumTest5() {
        val result = Solution().combinationSum(intArrayOf(), 5)
        assertEquals(listOf(), result)
    }

    @Test
    fun combinationSumTest6() {
        val result = Solution().combinationSum(intArrayOf(2, 3, 6, 7), 0)
        assertEquals(listOf(), result)
    }
}