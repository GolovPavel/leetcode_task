package ru.golov.leetcode.tasks.medium.three_sum

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun threeSumTest1() {
        val solution = Solution()
        val result = solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))

        assertEquals(listOf(listOf(-1,-1,2), listOf(-1,0,1)), result)
    }

    @Test
    fun threeSumTest2() {
        val solution = Solution()
        val result = solution.threeSum(intArrayOf(-2, -2, 0, 0, 2, 2))

        assertEquals(listOf(listOf(-2, 0, 2)), result)
    }

    @Test
    fun threeSumTest3() {
        val solution = Solution()
        val result = solution.threeSum(intArrayOf())

        assertEquals(listOf(), result)
    }

    @Test
    fun threeSumTest4() {
        val solution = Solution()
        val result = solution.threeSum(intArrayOf(0))

        assertEquals(listOf(), result)
    }
}