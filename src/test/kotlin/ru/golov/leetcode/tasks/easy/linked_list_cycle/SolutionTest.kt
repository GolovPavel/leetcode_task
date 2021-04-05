package ru.golov.leetcode.tasks.easy.linked_list_cycle

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class SolutionTest {

    @Test
    fun hasCycleTest1() {
        val result = Solution().hasCycle(null)

        assertFalse(result)
    }

    @Test
    fun hasCycleTest2() {
        val l = ListNode(1)

        val result = Solution().hasCycle(l)

        assertFalse(result)
    }

    @Test
    fun hasCycleTest3() {
        val l = ListNode(1)
        l.next = ListNode(2)

        val result = Solution().hasCycle(l)

        assertFalse(result)
    }

    @Test
    fun hasCycleTest4() {
        val l = ListNode(1)
        l.next = ListNode(2)
        l.next?.next = l

        val result = Solution().hasCycle(l)

        assertTrue(result)
    }

    @Test
    fun hasCycleTest5() {
        val l = ListNode(1)
        l.next = ListNode(2)
        l.next?.next = ListNode(3)
        l.next?.next?.next = l.next

        val result = Solution().hasCycle(l)

        assertTrue(result)
    }
}