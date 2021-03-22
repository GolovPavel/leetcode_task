package ru.golov.leetcode.tasks.medium.inorder_traversal

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun inorderTraversalRecursive1() {
        val root = TreeNode(1)

        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        assertEquals(listOf(1, 3, 2), result)
    }

    @Test
    fun inorderTraversalRecursive2() {
        val solution = Solution()
        val result = solution.inorderTraversalRecursive(null)

        assertEquals(listOf(), result)
    }

    @Test
    fun inorderTraversalRecursive3() {
        val root = TreeNode(1)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        assertEquals(listOf(1), result)
    }

    @Test
    fun inorderTraversalRecursive4() {
        val root = TreeNode(1)

        root.left= TreeNode(2)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        assertEquals(listOf(2, 1), result)
    }

    @Test
    fun inorderTraversalRecursive5() {
        val root = TreeNode(1)

        root.right= TreeNode(2)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        assertEquals(listOf(1, 2), result)
    }
}