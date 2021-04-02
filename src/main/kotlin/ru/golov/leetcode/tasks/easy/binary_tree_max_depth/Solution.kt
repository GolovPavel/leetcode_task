package ru.golov.leetcode.tasks.easy.binary_tree_max_depth

import kotlin.math.max

class Solution {

    fun maxDepth(root: TreeNode?): Int {
        return getNodeDepth(root, 1)
    }

    private fun getNodeDepth(node: TreeNode?, currentDepth: Int): Int {
        if (node == null) {
            return currentDepth - 1
        }

        return max(getNodeDepth(node.left, currentDepth + 1), getNodeDepth(node.right, currentDepth + 1))
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
