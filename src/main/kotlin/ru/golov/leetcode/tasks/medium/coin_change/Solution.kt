package ru.golov.leetcode.tasks.medium.coin_change

import kotlin.math.min

class Solution {

    fun coinChange(coins: IntArray, amount: Int): Int {
        if (amount < 1) {
            return 0
        }

        val result = IntArray(amount + 1)

        for (i in 1..amount) {
            var min = -1

            for (coin in coins) {
                val remainder = i - coin

                if (remainder >= 0 && result[remainder] != -1) {
                    val remainderMin = result[remainder]
                    min = if (min == -1) remainderMin + 1 else min(remainderMin + 1, min)
                }
            }

            result[i] = min
        }

        return result[amount]
    }
}