package ru.golov.leetcode.tasks.easy.buy_sell_stock

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun maxProfitTest1() {
        val solution = Solution()
        val result = solution.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))

        assertEquals(5, result)
    }

    @Test
    fun maxProfitTest2() {
        val solution = Solution()
        val result = solution.maxProfit(intArrayOf(7, 6, 4, 3, 1))

        assertEquals(0, result)
    }
}