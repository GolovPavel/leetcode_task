package ru.golov.leetcode.tasks.easy.climbing_stairs

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun climbStairsRecursiveTest1() {
        val result = Solution().climbStairsRecursive(2)

        assertEquals(2, result)
    }

    @Test
    fun climbStairsRecursiveTest2() {
        val result = Solution().climbStairsRecursive(3)

        assertEquals(3, result)
    }

    @Test
    fun climbStairsDynamicallyTest1() {
        val result = Solution().climbStairsDynamically(2)

        assertEquals(2, result)
    }

    @Test
    fun climbStairsDynamicallyTest2() {
        val result = Solution().climbStairsDynamically(3)

        assertEquals(3, result)
    }
}