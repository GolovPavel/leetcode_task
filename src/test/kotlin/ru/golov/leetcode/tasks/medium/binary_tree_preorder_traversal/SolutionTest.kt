package ru.golov.leetcode.tasks.medium.binary_tree_preorder_traversal

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun preorderTraversalRecursiveTest11() {
        val root = TreeNode(1)

        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val solution = Solution()
        val result = solution.preorderTraversalRecursive(root)

        assertEquals(listOf(1, 2, 3), result)
    }

    @Test
    fun preorderTraversalRecursiveTest12() {
        val solution = Solution()
        val result = solution.preorderTraversalRecursive(null)

        assertEquals(listOf(), result)
    }

    @Test
    fun preorderTraversalRecursiveTest13() {
        val root = TreeNode(1)

        val solution = Solution()
        val result = solution.preorderTraversalRecursive(root)

        assertEquals(listOf(1), result)
    }

    @Test
    fun preorderTraversalRecursiveTest14() {
        val root = TreeNode(1)

        root.left = TreeNode(2)

        val solution = Solution()
        val result = solution.preorderTraversalRecursive(root)

        assertEquals(listOf(1, 2), result)
    }

    @Test
    fun preorderTraversalRecursiveTest15() {
        val root = TreeNode(1)

        root.right = TreeNode(2)

        val solution = Solution()
        val result = solution.preorderTraversalRecursive(root)

        assertEquals(listOf(1, 2), result)
    }

    @Test
    fun inorderTraversalIterativeTest1() {
        val root = TreeNode(1)

        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val solution = Solution()
        val result = solution.preorderTraversalIterative(root)

        assertEquals(listOf(1, 2, 3), result)
    }

    @Test
    fun inorderTraversalIterativeTest2() {
        val solution = Solution()
        val result = solution.preorderTraversalIterative(null)

        assertEquals(listOf(), result)
    }

    @Test
    fun inorderTraversalIterativeTest3() {
        val root = TreeNode(1)

        val solution = Solution()
        val result = solution.preorderTraversalIterative(root)

        assertEquals(listOf(1), result)
    }

    @Test
    fun inorderTraversalIterativeTest4() {
        val root = TreeNode(1)

        root.left = TreeNode(2)

        val solution = Solution()
        val result = solution.preorderTraversalIterative(root)

        assertEquals(listOf(1, 2), result)
    }

    @Test
    fun inorderTraversalIterativeTest5() {
        val root = TreeNode(1)

        root.right = TreeNode(2)

        val solution = Solution()
        val result = solution.preorderTraversalIterative(root)

        assertEquals(listOf(1, 2), result)
    }
}