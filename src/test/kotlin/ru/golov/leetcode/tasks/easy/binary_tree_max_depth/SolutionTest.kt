package ru.golov.leetcode.tasks.easy.binary_tree_max_depth

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun maxDepthTest1() {
        val root = TreeNode(1)

        root.left = TreeNode(2)
        root.right = TreeNode(3)

        root.right?.left = TreeNode(4)
        root.right?.right = TreeNode(5)

        val result = Solution().maxDepth(root)

        assertEquals(3, result)
    }

    @Test
    fun maxDepthTest2() {
        val root = TreeNode(1)

        root.left = TreeNode(2)

        val result = Solution().maxDepth(root)

        assertEquals(2, result)
    }

    @Test
    fun maxDepthTest3() {
        val result = Solution().maxDepth(null)

        assertEquals(0, result)
    }

    @Test
    fun maxDepthTest4() {
        val root = TreeNode(1)

        val result = Solution().maxDepth(root)

        assertEquals(1, result)
    }
}