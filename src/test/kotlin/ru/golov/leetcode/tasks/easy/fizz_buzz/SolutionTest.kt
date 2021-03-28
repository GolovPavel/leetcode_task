package ru.golov.leetcode.tasks.easy.fizz_buzz

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun fizzBuzzTest() {
        val result = Solution().fizzBuzz(15)
        val expected = listOf(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz"
        )

        assertEquals(expected, result)
    }
}