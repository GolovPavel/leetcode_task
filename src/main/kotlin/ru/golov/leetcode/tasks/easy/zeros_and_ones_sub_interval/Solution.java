package ru.golov.leetcode.tasks.easy.zeros_and_ones_sub_interval;

public class Solution {

    /**
     * Дан массив из нулей и единиц.
     * Нужно определить, какой максимальный по длине подинтервал единиц можно получить, удалив ровно один элемент массива.
     */
    // f([1, 1, 0, 1]) -> 3
    // f([1, 0, 0, 1, 1]) -> 2
    // f([1, 0, 1, 0, 1, 1]) -> 3
    public int maxSubInterval(int[] arr) {
        var maxInterval = 0;
        var currentOnes = 0;

        var beforeZero = 0;
        var zeroOccurred = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentOnes += 1;
                maxInterval = Math.max(maxInterval, currentOnes);
            } else {
                if (!zeroOccurred) {
                    zeroOccurred = true;
                } else {
                    currentOnes -= beforeZero;
                }

                beforeZero = currentOnes;
            }
        }

        return maxInterval;
    }
}
