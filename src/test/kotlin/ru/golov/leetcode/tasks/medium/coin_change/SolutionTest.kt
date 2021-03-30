package ru.golov.leetcode.tasks.medium.coin_change

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun coinChangeTest1() {
        val result = Solution().coinChange(intArrayOf(1, 2, 5), 11)
        assertEquals(3, result)
    }

    @Test
    fun coinChangeTest2() {
        val result = Solution().coinChange(intArrayOf(2), 3)
        assertEquals(-1, result)
    }

    @Test
    fun coinChangeTest3() {
        val result = Solution().coinChange(intArrayOf(1), 0)
        assertEquals(0, result)
    }

    @Test
    fun coinChangeTest4() {
        val result = Solution().coinChange(intArrayOf(1), 1)
        assertEquals(1, result)
    }

    @Test
    fun coinChangeTest5() {
        val result = Solution().coinChange(intArrayOf(1), 2)
        assertEquals(2, result)
    }
}