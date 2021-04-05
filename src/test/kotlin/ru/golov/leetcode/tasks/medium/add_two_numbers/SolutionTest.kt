package ru.golov.leetcode.tasks.medium.add_two_numbers

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun addTwoNumbersTest1() {
        val result = Solution().addTwoNumbers(null, null)

        assertEquals(null, result)
    }

    @Test
    fun addTwoNumbersTest2() {
        val l1 = ListNode(1)
        l1.next = ListNode(1)

        val l2 = ListNode(1)
        l2.next = ListNode(1)

        val expected = ListNode(2)
        expected.next = ListNode(2)

        val result = Solution().addTwoNumbers(l1, l2)

        assertEquals(expected, result)
    }

    @Test
    fun addTwoNumbersTest3() {
        val l1 = ListNode(9)

        val l2 = ListNode(9)

        val expected = ListNode(8)
        expected.next = ListNode(1)

        val result = Solution().addTwoNumbers(l1, l2)

        assertEquals(expected, result)
    }

    @Test
    fun addTwoNumbersTest4() {
        val l1 = ListNode(1)
        l1.next = ListNode(8)

        val l2 = ListNode(0)
        l2.next = ListNode(3)

        val expected = ListNode(1)
        expected.next = ListNode(1)
        expected.next?.next = ListNode(1)

        val result = Solution().addTwoNumbers(l1, l2)

        assertEquals(expected, result)
    }
}