package ru.golov.leetcode.tasks.medium.binary_tree_inorder_traversal

import java.util.Stack

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

    fun inorderTraversalRecursive2(root: TreeNode?): List<Int> {
        val traversalResult = mutableListOf<Int>()

        recurseTraverse(root, traversalResult)

        return traversalResult
    }

    private fun recurseTraverse(root: TreeNode?, traversalResult: MutableList<Int>) {
        if (root == null) {
            return
        }

        if (root.left != null) {
            recurseTraverse(root.left, traversalResult)
        }

        traversalResult.add(root.`val`)

        if (root.right != null) {
            recurseTraverse(root.right, traversalResult)
        }
    }

    fun inorderTraversalIterative(root: TreeNode?): List<Int> {
        if (root == null) {
            return listOf()
        }

        val result = mutableListOf<Int>()
        val stack = Stack<TreeNode>()
        var currentNode = root

        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode)
                currentNode = currentNode.left
            }
           currentNode = stack.pop()
           result.add(currentNode.`val`)
           currentNode = currentNode.right
        }

        return result
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