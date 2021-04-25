package ru.golov.leetcode.tasks.easy.best_time_to_buy_sell_stock_2;

class Solution {
    public int maxProfit(int[] prices) {
        var profit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            profit += Math.max(0, prices[i] - prices[i - 1]);
        }
        
        return profit;
    }
}