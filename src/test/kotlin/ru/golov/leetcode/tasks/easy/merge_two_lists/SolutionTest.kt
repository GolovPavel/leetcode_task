package ru.golov.leetcode.tasks.easy.merge_two_lists

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun mergeTwoListsTest1() {
        val result = Solution().mergeTwoLists(null, null)

        assertEquals(null, result)
    }

    @Test
    fun mergeTwoListsTest2() {
        val l1 = ListNode(1)
        l1.next = ListNode(4)
        l1.next?.next = ListNode(6)

        val l2 = ListNode(2)
        l2.next = ListNode(5)

        val expected = ListNode(1)
        expected.next = ListNode(2)
        expected.next?.next = ListNode(4)
        expected.next?.next?.next = ListNode(5)
        expected.next?.next?.next?.next = ListNode(6)

        val result = Solution().mergeTwoLists(l1, l2)

        assertEquals(expected, result)
    }

    @Test
    fun mergeTwoListsTest3() {
        val l2 = ListNode(1)
        l2.next = ListNode(2)

        val expected = ListNode(1)
        expected.next = ListNode(2)

        val result = Solution().mergeTwoLists(null, l2)

        assertEquals(expected, result)
    }
}