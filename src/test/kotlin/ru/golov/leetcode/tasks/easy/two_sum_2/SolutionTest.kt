package ru.golov.leetcode.tasks.easy.two_sum_2

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class SolutionTest {

    @Test
    fun maxProfitBinarySearchTest1() {
        val solution = Solution()
        val result = solution.twoSumBinarySearch(intArrayOf(2, 7, 11, 15), 9)

        assertTrue(intArrayOf(0, 1).contentEquals(result))
    }

    @Test
    fun maxProfitBinarySearchTest2() {
        val solution = Solution()
        val result = solution.twoSumBinarySearch(intArrayOf(2, 3, 4), 6)

        assertTrue(intArrayOf(0, 2).contentEquals(result))
    }

    @Test
    fun maxProfitBinarySearchTest3() {
        val solution = Solution()
        val result = solution.twoSumBinarySearch(intArrayOf(-1, 0), -1)

        assertTrue(intArrayOf(0, 1).contentEquals(result))
    }

    @Test
    fun maxProfitTwoPointerTest1() {
        val solution = Solution()
        val result = solution.twoSumTwoPointers(intArrayOf(2, 7, 11, 15), 9)

        assertTrue(intArrayOf(0, 1).contentEquals(result))
    }

    @Test
    fun maxProfitTwoPointerTest2() {
        val solution = Solution()
        val result = solution.twoSumTwoPointers(intArrayOf(2, 3, 4), 6)

        assertTrue(intArrayOf(0, 2).contentEquals(result))
    }

    @Test
    fun maxProfitTwoPointerTest3() {
        val solution = Solution()
        val result = solution.twoSumTwoPointers(intArrayOf(-1, 0), -1)

        assertTrue(intArrayOf(0, 1).contentEquals(result))
    }
}