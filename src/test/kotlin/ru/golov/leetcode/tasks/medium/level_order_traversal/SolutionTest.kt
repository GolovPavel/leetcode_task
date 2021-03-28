package ru.golov.leetcode.tasks.medium.level_order_traversal

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun levelOrderTraversalTest1() {
        val root = TreeNode(1)

        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val solution = Solution()
        val result = solution.levelOrder(root)

        assertEquals(listOf(listOf(1), listOf(2), listOf(3)), result)
    }

    @Test
    fun levelOrderTraversalTest2() {
        val solution = Solution()
        val result = solution.levelOrder(null)

        assertEquals(listOf(), result)
    }

    @Test
    fun levelOrderTraversalTest3() {
        val root = TreeNode(1)

        val solution = Solution()
        val result = solution.levelOrder(root)

        assertEquals(listOf(listOf(1)), result)
    }

    @Test
    fun levelOrderTraversalTest4() {
        val root = TreeNode(1)

        root.left = TreeNode(2)

        val solution = Solution()
        val result = solution.levelOrder(root)

        assertEquals(listOf(listOf(1), listOf(2)), result)
    }

    @Test
    fun levelOrderTraversalTest5() {
        val root = TreeNode(1)

        root.right = TreeNode(2)

        val solution = Solution()
        val result = solution.levelOrder(root)

        assertEquals(listOf(listOf(1), listOf(2)), result)
    }

    @Test
    fun levelOrderTraversalTest6() {
        val root = TreeNode(1)

        root.left = TreeNode(2)
        root.right = TreeNode(3)

        root.right?.left = TreeNode(4)
        root.right?.right = TreeNode(5)

        val solution = Solution()
        val result = solution.levelOrder(root)

        assertEquals(listOf(listOf(1), listOf(2, 3), listOf(4, 5)), result)
    }
}