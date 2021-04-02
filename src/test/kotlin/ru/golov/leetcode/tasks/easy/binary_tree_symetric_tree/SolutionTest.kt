package ru.golov.leetcode.tasks.easy.binary_tree_symetric_tree

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun isSymmetricTest1() {
        val root = TreeNode(1)

        root.left = TreeNode(2)
        root.right = TreeNode(2)

        root.right?.left = TreeNode(3)
        root.right?.right = TreeNode(4)

        root.left?.left = TreeNode(4)
        root.left?.right = TreeNode(3)

        val result = Solution().isSymmetric(root)

        assertEquals(true, result)
    }

    @Test
    fun isSymmetricTest2() {
        val root = TreeNode(1)

        root.left = TreeNode(2)
        root.right = TreeNode(2)

        root.right?.right = TreeNode(3)

        root.left?.right = TreeNode(3)

        val result = Solution().isSymmetric(root)

        assertEquals(false, result)
    }

    @Test
    fun isSymmetricTest3() {
        val root = TreeNode(1)

        val result = Solution().isSymmetric(root)

        assertEquals(true, result)
    }

    @Test
    fun isSymmetricTest4() {
        val result = Solution().isSymmetric(null)

        assertEquals(true, result)
    }
}