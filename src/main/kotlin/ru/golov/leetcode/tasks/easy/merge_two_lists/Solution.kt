package ru.golov.leetcode.tasks.easy.merge_two_lists

class Solution {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null && l2 == null) {
            return null
        }

        val resultHead = ListNode(0)
        var currentNode = resultHead
        var l1Node = l1
        var l2Node = l2

        while (l1Node != null && l2Node != null) {
            val newNode = ListNode(0)

            if (l1Node.`val` < l2Node.`val`) {
                newNode.`val` = l1Node.`val`
                l1Node = l1Node?.next
            } else {
                newNode.`val` = l2Node.`val`
                l2Node = l2Node?.next
            }

            currentNode.next = newNode
            currentNode = newNode
        }

        if (l1Node != null) {
            currentNode.next = l1Node
        }

        if (l2Node != null) {
            currentNode.next = l2Node
        }

        return resultHead.next
    }
}

data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
