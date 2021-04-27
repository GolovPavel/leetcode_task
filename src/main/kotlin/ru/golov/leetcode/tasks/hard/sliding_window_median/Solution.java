package ru.golov.leetcode.tasks.hard.sliding_window_median;

import java.util.TreeSet;
import java.util.Comparator;

class Solution {
    
    public double[] medianSlidingWindow(int[] nums, int k) {
        Comparator<Integer> comparator = (a, b) -> nums[a] != nums[b] ? Integer.compare(nums[a], nums[b]) : Integer.compare(a, b);
        
        var minHeap = new TreeSet<>(comparator);
        var maxHeap = new TreeSet<>(comparator.reversed());
        
        var result = new double[nums.length - k + 1];
        
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(i);
            maxHeap.add(minHeap.pollFirst());
            
            if (maxHeap.size() > minHeap.size()) {
                minHeap.add(maxHeap.pollFirst());
            }
            
            if (i >= k - 1) {
                result[i - k + 1] = getMedian(nums, minHeap, maxHeap, k);
                minHeap.remove(i - k + 1);
                maxHeap.remove(i - k + 1);
            }
        }
        
        return result;
    }
    
    private double getMedian(int[] nums, TreeSet<Integer> minHeap, TreeSet<Integer> maxHeap, int k) {
        if (k % 2 == 0) {
            return ((double) nums[minHeap.first()] + nums[maxHeap.first()]) / 2; 
        } else {
            return (double) nums[minHeap.first()];
        }
    }
}