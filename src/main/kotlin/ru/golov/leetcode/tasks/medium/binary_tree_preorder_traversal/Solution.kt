package ru.golov.leetcode.tasks.medium.binary_tree_preorder_traversal

import java.util.Stack

class Solution {
    fun preorderTraversalRecursive(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        helper(root, result)
        return result
    }

    private fun helper(node: TreeNode?, result: MutableList<Int>) {
        if (node == null) {
            return
        }

        result.add(node.`val`)

        helper(node.left, result)
        helper(node.right, result)
    }

    fun preorderTraversalIterative(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()

        if (root == null) {
            return result
        }

        val stack = Stack<TreeNode>()
        stack.push(root)

        while (!stack.isEmpty()) {
            val currentNode = stack.pop()

            result.add(currentNode.`val`)

            if (currentNode.right != null) {
                stack.push(currentNode.right)
            }

            if (currentNode.left != null) {
                stack.push(currentNode.left)
            }
        }

        return result
    }
}


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
