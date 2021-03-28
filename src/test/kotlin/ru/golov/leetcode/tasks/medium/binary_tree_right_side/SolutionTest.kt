package ru.golov.leetcode.tasks.medium.binary_tree_right_side

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun rightSideViewTest1() {
        val root = TreeNode(1)

        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val solution = Solution()
        val result = solution.rightSideView(root)

        assertEquals(listOf(1, 2, 3), result)
    }

    @Test
    fun rightSideViewTest2() {
        val solution = Solution()
        val result = solution.rightSideView(null)

        assertEquals(listOf(), result)
    }

    @Test
    fun rightSideViewTest3() {
        val root = TreeNode(1)

        val solution = Solution()
        val result = solution.rightSideView(root)

        assertEquals(listOf(1), result)
    }

    @Test
    fun rightSideViewTest4() {
        val root = TreeNode(1)

        root.left = TreeNode(2)

        val solution = Solution()
        val result = solution.rightSideView(root)

        assertEquals(listOf(1, 2), result)
    }

    @Test
    fun rightSideViewTest5() {
        val root = TreeNode(1)

        root.right = TreeNode(2)

        val solution = Solution()
        val result = solution.rightSideView(root)

        assertEquals(listOf(1, 2), result)
    }

    @Test
    fun rightSideViewTest6() {
        val root = TreeNode(1)

        root.left = TreeNode(2)
        root.right = TreeNode(3)

        root.right?.left = TreeNode(4)
        root.right?.right = TreeNode(5)

        val solution = Solution()
        val result = solution.rightSideView(root)

        assertEquals(listOf(1, 3, 5), result)
    }
}