package ru.golov.leetcode.tasks.medium.inorder_traversal

class Solution {

    fun inorderTraversalRecursive(root: TreeNode?): List<Int> {
        val traversalResult = mutableListOf<Int>()

        if (root != null) {
            traversalResult.addAll(inorderTraversalRecursive(root.left))
            traversalResult.add(root.`val`)
            traversalResult.addAll(inorderTraversalRecursive(root.right))
        }

        return traversalResult
    }

    fun inorderTraversalIterative(root: TreeNode?): List<Int> {
        TODO()
    }
}

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 */
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}