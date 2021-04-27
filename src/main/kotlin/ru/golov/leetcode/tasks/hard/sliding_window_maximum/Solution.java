package ru.golov.leetcode.tasks.hard.sliding_window_maximum;

import java.util.LinkedList;

class Solution {

    // f([1], 1) -> [1]
    // f([1, 2], 1) -> [1, 2]
    // f([1, 2, 3, 4], 2) -> [2, 3, 4]
    // f([4, 3, 2, 1], 2) -> [4, 3, 2]
    // f([1, 4, 2, -1, 5], 2) -> [4, 4, 2, 5]
    public int[] maxSlidingWindow(int[] nums, int k) {
        var result = new int[nums.length - k + 1];
        var dequeue = new LinkedList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!dequeue.isEmpty() && dequeue.peek() < i - k + 1) {
                dequeue.poll();
            }

            while (!dequeue.isEmpty() && nums[i] > nums[dequeue.peekLast()]) {
                dequeue.pollLast();
            }

            dequeue.offer(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[dequeue.peek()];
            }
        }

        return result;
    }
}