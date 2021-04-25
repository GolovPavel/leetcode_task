package ru.golov.leetcode.tasks.medium.best_time_to_buy_sell_stock_transaction_fee;

class Solution {
    
    // 2 States: (Hold, Rest)
    public int maxProfit(int[] prices, int fee) {
        var prevRest = 0;
        var rest = 0;
        var prevHold = -prices[0];
        var hold = 0;
        
        for (int price : prices) {
            rest = Math.max(prevRest, prevHold + price - fee);
            hold = Math.max(prevHold, prevRest - price);
            
            prevRest = rest;
            prevHold = hold;
        }
        
        return rest;
    }
}