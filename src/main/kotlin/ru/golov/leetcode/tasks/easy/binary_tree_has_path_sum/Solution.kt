package ru.golov.leetcode.tasks.easy.binary_tree_has_path_sum

class Solution {

    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) {
            return false
        }

        val remainder = targetSum - root.`val`

        if (root.left == null && root.right == null) {
            return remainder == 0
        }

        return hasPathSum(root.left, remainder) || hasPathSum(root.right, remainder)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}