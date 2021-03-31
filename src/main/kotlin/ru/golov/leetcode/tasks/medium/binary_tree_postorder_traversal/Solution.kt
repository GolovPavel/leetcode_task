package ru.golov.leetcode.tasks.medium.binary_tree_postorder_traversal

import java.util.LinkedList
import java.util.Stack

class Solution {

    fun postorderTraversalRecursive(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        helper(root, result)
        return result
    }

    private fun helper(node: TreeNode?, result: MutableList<Int>) {
        if (node == null) {
            return
        }

        helper(node.left, result)
        helper(node.right, result)
        result.add(node.`val`)
    }

    fun postorderTraversalIterative(root: TreeNode?): List<Int> {
        val result = LinkedList<Int>()

        if (root == null) {
            return result
        }

        val stack = Stack<TreeNode>()
        var currentNode = root

        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode)
                result.addFirst(currentNode.`val`)
                currentNode = currentNode.right
            }

            currentNode = stack.pop().left
        }

        return result
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}