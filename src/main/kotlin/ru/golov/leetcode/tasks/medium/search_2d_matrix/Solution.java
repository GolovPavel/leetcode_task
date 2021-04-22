package ru.golov.leetcode.tasks.medium.search_2d_matrix;

class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        var start = 0;
        var cols = matrix[0].length;
        var end = matrix.length * cols - 1;

        while (start <= end) {
            var mid = start + (end - start) / 2;
            var midVal = matrix[mid / cols][mid % cols];

            if (midVal == target) {
                return true;
            } else if (midVal > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}