package ru.golov.leetcode.tasks.easy.climbing_stairs

class Solution {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n) - the depth of recursion tree.
     */
    fun climbStairsRecursive(n: Int): Int {
        val memo = IntArray(n + 1)
        return climbRecursive(0, n, memo)
    }

    private fun climbRecursive(i: Int, n: Int, memo: IntArray): Int {
        if (i > n) {
            return 0
        }

        if (i == n) {
            return 1
        }

        if (memo[i] > 0) {
            return memo[i]
        }

        memo[i] = climbRecursive(i + 1, n, memo) + climbRecursive(i + 2, n, memo)
        return memo[i]
    }

    fun climbStairsDynamically(n: Int): Int {
        if (n == 1) {
            return 1
        }

        val stairs = IntArray(n + 1)
        stairs[1] = 1
        stairs[2] = 2

        for (i in 3..n) {
            stairs[i] = stairs[i - 1] + stairs[i - 2]
        }

        return stairs[n]
    }
}