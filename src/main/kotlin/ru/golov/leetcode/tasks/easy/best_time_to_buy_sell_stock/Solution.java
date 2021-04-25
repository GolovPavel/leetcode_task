package ru.golov.leetcode.tasks.easy.best_time_to_buy_sell_stock;

class Solution {
    public int maxProfit(int[] prices) {
        var minPrice = Integer.MAX_VALUE;
        var maxProfit = 0;
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        
        return maxProfit;
    }
}