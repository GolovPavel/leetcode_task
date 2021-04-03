package ru.golov.leetcode.tasks.easy.binary_tree_has_path_sum

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun hasPathSumTest1() {
        val root = TreeNode(5)

        root.left = TreeNode(4)
        root.right = TreeNode(8)

        root.right?.left = TreeNode(13)
        root.right?.right = TreeNode(4)

        root.right?.right?.right = TreeNode(1)

        root.left?.left = TreeNode(11)
        root.left?.left?.left = TreeNode(7)
        root.left?.left?.right = TreeNode(2)

        val result = Solution().hasPathSum(root, 22)

        assertEquals(true, result)
    }

    @Test
    fun hasPathSumTest2() {
        val root = TreeNode(1)

        root.left = TreeNode(2)
        root.right = TreeNode(3)

        val result = Solution().hasPathSum(root, 5)

        assertEquals(false, result)
    }

    @Test
    fun hasPathSumTest3() {
        val root = TreeNode(1)

        root.left = TreeNode(2)

        val result = Solution().hasPathSum(root, 0)

        assertEquals(false, result)
    }
}