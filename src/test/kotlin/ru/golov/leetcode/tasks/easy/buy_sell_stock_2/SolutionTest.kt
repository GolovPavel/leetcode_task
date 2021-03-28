package ru.golov.leetcode.tasks.easy.buy_sell_stock_2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun maxProfitTest1() {
        val prices = intArrayOf(7, 1, 5, 3, 6, 4);

        val result = Solution().maxProfit(prices)

        assertEquals(7, result)
    }

    @Test
    fun maxProfitTest2() {
        val prices = intArrayOf(1, 2, 3, 4, 5);

        val result = Solution().maxProfit(prices)

        assertEquals(4, result)
    }

    @Test
    fun maxProfitTest3() {
        val prices = intArrayOf(7, 6, 4, 3, 1);

        val result = Solution().maxProfit(prices)

        assertEquals(0, result)
    }
}