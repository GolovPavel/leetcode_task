package ru.golov.leetcode.tasks.easy.binary_tree_symetric_tree

class Solution {

    fun isSymmetric(root: TreeNode?): Boolean {
        return isSymmetric(root, root)
    }

    private fun isSymmetric(node1: TreeNode?, node2: TreeNode?): Boolean {
        if (node1 == null && node2 == null) {
            return true
        }

        if (node1 == null || node2 == null) {
            return false
        }

        return node1.`val` == node2.`val`
                && isSymmetric(node1.right, node2.left)
                && isSymmetric(node1.left, node2.right)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}