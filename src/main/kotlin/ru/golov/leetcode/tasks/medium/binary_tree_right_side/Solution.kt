package ru.golov.leetcode.tasks.medium.binary_tree_right_side

import java.util.LinkedList
import java.util.Queue

class Solution {

    fun rightSideView(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()

        if (root == null) {
            return result
        }

        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)

        while (!queue.isEmpty()) {
            val levelSize = queue.size

            for (i in 0 until levelSize) {
                if (queue.peek().left != null) {
                    queue.add(queue.peek().left)
                }

                if (queue.peek().right != null) {
                    queue.add(queue.peek().right)
                }

                val currentNode = queue.poll()

                if (i == levelSize - 1) {
                    result.add(currentNode.`val`)
                }
            }
        }

        return result
    }

    fun rightSideViewRecursive(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        helper(root, 0, result)
        return result
    }

    private fun helper(node: TreeNode?, level: Int, list: MutableList<Int>) {
        if (node == null) {
            return
        }

        if (level == list.size) {
            list.add(node.`val`)
        }

        helper(node.right, level + 1, list)
        helper(node.left, level + 1, list)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}