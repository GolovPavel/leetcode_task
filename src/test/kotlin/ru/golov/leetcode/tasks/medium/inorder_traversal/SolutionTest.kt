package ru.golov.leetcode.tasks.medium.inorder_traversal

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun inorderTraversalRecursive11() {
        val root = TreeNode(1)

        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        assertEquals(listOf(1, 3, 2), result)
    }

    @Test
    fun inorderTraversalRecursive12() {
        val solution = Solution()
        val result = solution.inorderTraversalRecursive(null)

        assertEquals(listOf(), result)
    }

    @Test
    fun inorderTraversalRecursive13() {
        val root = TreeNode(1)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        assertEquals(listOf(1), result)
    }

    @Test
    fun inorderTraversalRecursive14() {
        val root = TreeNode(1)

        root.left= TreeNode(2)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        assertEquals(listOf(2, 1), result)
    }

    @Test
    fun inorderTraversalRecursive15() {
        val root = TreeNode(1)

        root.right= TreeNode(2)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        assertEquals(listOf(1, 2), result)
    }

    @Test
    fun inorderTraversalRecursive21() {
        val root = TreeNode(1)

        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive2(root)

        assertEquals(listOf(1, 3, 2), result)
    }

    @Test
    fun inorderTraversalRecursive22() {
        val solution = Solution()
        val result = solution.inorderTraversalRecursive2(null)

        assertEquals(listOf(), result)
    }

    @Test
    fun inorderTraversalRecursive23() {
        val root = TreeNode(1)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive2(root)

        assertEquals(listOf(1), result)
    }

    @Test
    fun inorderTraversalRecursive24() {
        val root = TreeNode(1)

        root.left= TreeNode(2)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive2(root)

        assertEquals(listOf(2, 1), result)
    }

    @Test
    fun inorderTraversalRecursive25() {
        val root = TreeNode(1)

        root.right= TreeNode(2)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive2(root)

        assertEquals(listOf(1, 2), result)
    }
}