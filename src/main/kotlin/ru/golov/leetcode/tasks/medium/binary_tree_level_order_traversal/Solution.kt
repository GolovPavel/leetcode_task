package ru.golov.leetcode.tasks.medium.binary_tree_level_order_traversal

import java.util.LinkedList
import java.util.Queue

class Solution {

    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        if (root == null) {
            return result
        }

        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)

        while (!queue.isEmpty()) {
            val levelSize = queue.size
            val subList = mutableListOf<Int>()

            for (i in 0 until levelSize) {
                if (queue.peek().left != null) {
                    queue.add(queue.peek().left)
                }

                if (queue.peek().right != null) {
                    queue.add(queue.peek().right)
                }

                subList.add(queue.poll().`val`)
            }

            result.add(subList)
        }

        return result
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}