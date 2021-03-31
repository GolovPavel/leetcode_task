package ru.golov.leetcode.tasks.medium.binary_tree_postorder_traversal

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun postorderTraversalRecursiveTest11() {
        val root = TreeNode(1)

        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val solution = Solution()
        val result = solution.postorderTraversalRecursive(root)

        assertEquals(listOf(3, 2, 1), result)
    }

    @Test
    fun postorderTraversalRecursiveTest12() {
        val solution = Solution()
        val result = solution.postorderTraversalRecursive(null)

        assertEquals(listOf(), result)
    }

    @Test
    fun postorderTraversalRecursiveTest13() {
        val root = TreeNode(1)

        val solution = Solution()
        val result = solution.postorderTraversalRecursive(root)

        assertEquals(listOf(1), result)
    }

    @Test
    fun postorderTraversalRecursiveTest14() {
        val root = TreeNode(1)

        root.left = TreeNode(2)

        val solution = Solution()
        val result = solution.postorderTraversalRecursive(root)

        assertEquals(listOf(2, 1), result)
    }

    @Test
    fun postorderTraversalRecursiveTest15() {
        val root = TreeNode(1)

        root.right = TreeNode(2)

        val solution = Solution()
        val result = solution.postorderTraversalRecursive(root)

        assertEquals(listOf(2, 1), result)
    }

    @Test
    fun postorderTraversalIterativeTest1() {
        val root = TreeNode(1)

        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val solution = Solution()
        val result = solution.postorderTraversalIterative(root)

        assertEquals(listOf(3, 2, 1), result)
    }

    @Test
    fun postorderTraversalIterativeTest2() {
        val solution = Solution()
        val result = solution.postorderTraversalIterative(null)

        assertEquals(listOf(), result)
    }

    @Test
    fun postorderTraversalIterativeTest3() {
        val root = TreeNode(1)

        val solution = Solution()
        val result = solution.postorderTraversalIterative(root)

        assertEquals(listOf(1), result)
    }

    @Test
    fun postorderTraversalIterativeTest4() {
        val root = TreeNode(1)

        root.left = TreeNode(2)

        val solution = Solution()
        val result = solution.postorderTraversalIterative(root)

        assertEquals(listOf(2, 1), result)
    }

    @Test
    fun postorderTraversalIterativeTest5() {
        val root = TreeNode(1)

        root.right = TreeNode(2)

        val solution = Solution()
        val result = solution.postorderTraversalIterative(root)

        assertEquals(listOf(2, 1), result)
    }
}
