package ru.golov.leetcode.tasks.easy.buy_sell_stock

class Solution {

    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0

        prices.forEach {
            if (it < minPrice) {
                minPrice = it
            } else if (it - minPrice > maxProfit) {
                maxProfit = it - minPrice
            }
        }

        return maxProfit
    }
}