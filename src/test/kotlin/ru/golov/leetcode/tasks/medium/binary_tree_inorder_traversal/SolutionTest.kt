package ru.golov.leetcode.tasks.medium.binary_tree_inorder_traversal

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun inorderTraversalRecursiveTest11() {
        val root = TreeNode(1)

        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        assertEquals(listOf(1, 3, 2), result)
    }

    @Test
    fun inorderTraversalRecursiveTest12() {
        val solution = Solution()
        val result = solution.inorderTraversalRecursive(null)

        assertEquals(listOf(), result)
    }

    @Test
    fun inorderTraversalRecursiveTest13() {
        val root = TreeNode(1)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        assertEquals(listOf(1), result)
    }

    @Test
    fun inorderTraversalRecursiveTest14() {
        val root = TreeNode(1)

        root.left= TreeNode(2)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        assertEquals(listOf(2, 1), result)
    }

    @Test
    fun inorderTraversalRecursiveTest15() {
        val root = TreeNode(1)

        root.right= TreeNode(2)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        assertEquals(listOf(1, 2), result)
    }

    @Test
    fun inorderTraversalRecursiveTest21() {
        val root = TreeNode(1)

        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive2(root)

        assertEquals(listOf(1, 3, 2), result)
    }

    @Test
    fun inorderTraversalRecursiveTest22() {
        val solution = Solution()
        val result = solution.inorderTraversalRecursive2(null)

        assertEquals(listOf(), result)
    }

    @Test
    fun inorderTraversalRecursiveTest23() {
        val root = TreeNode(1)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive2(root)

        assertEquals(listOf(1), result)
    }

    @Test
    fun inorderTraversalRecursiveTest24() {
        val root = TreeNode(1)

        root.left= TreeNode(2)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive2(root)

        assertEquals(listOf(2, 1), result)
    }

    @Test
    fun inorderTraversalRecursiveTest25() {
        val root = TreeNode(1)

        root.right= TreeNode(2)

        val solution = Solution()
        val result = solution.inorderTraversalRecursive2(root)

        assertEquals(listOf(1, 2), result)
    }

    @Test
    fun inorderTraversalIterativeTest1() {
        val root = TreeNode(1)

        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val solution = Solution()
        val result = solution.inorderTraversalIterative(root)

        assertEquals(listOf(1, 3, 2), result)
    }

    @Test
    fun inorderTraversalIterativeTest2() {
        val solution = Solution()
        val result = solution.inorderTraversalIterative(null)

        assertEquals(listOf(), result)
    }

    @Test
    fun inorderTraversalIterativeTest3() {
        val root = TreeNode(1)

        val solution = Solution()
        val result = solution.inorderTraversalIterative(root)

        assertEquals(listOf(1), result)
    }

    @Test
    fun inorderTraversalIterativeTest4() {
        val root = TreeNode(1)

        root.left= TreeNode(2)

        val solution = Solution()
        val result = solution.inorderTraversalIterative(root)

        assertEquals(listOf(2, 1), result)
    }

    @Test
    fun inorderTraversalIterativeTest5() {
        val root = TreeNode(1)

        root.right= TreeNode(2)

        val solution = Solution()
        val result = solution.inorderTraversalIterative(root)

        assertEquals(listOf(1, 2), result)
    }
}