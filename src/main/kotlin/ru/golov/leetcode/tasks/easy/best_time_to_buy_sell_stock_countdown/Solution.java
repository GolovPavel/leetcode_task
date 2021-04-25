package ru.golov.leetcode.tasks.easy.best_time_to_buy_sell_stock_countdown;

class Solution {
    public int maxProfit(int[] prices) {

        var rest = new int[prices.length];
        var hold = new int[prices.length];
        var sold = new int[prices.length];

        rest[0] = 0;
        hold[0] = -prices[0];
        sold[0] = 0;

        for (int i = 1; i < prices.length; i++) {
            rest[i] = Math.max(rest[i - 1], sold[i - 1]);
            hold[i] = Math.max(hold[i - 1], rest[i - 1] - prices[i]);
            sold[i] = hold[i - 1] + prices[i];
        }

        return Math.max(rest[prices.length - 1], sold[prices.length - 1]);
    }
}