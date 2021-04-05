package ru.golov.leetcode.tasks.medium.add_two_numbers

data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}


/**
 * [], [] -> []
 * [1, 1], [2, 2] -> [3, 3]
 * [9], [9] -> [8, 1]
 * [1, 8], [0, 3] -> [1, 1, 1]
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val headNode = ListNode(0)
        var currentNode: ListNode = headNode
        var l1Node = l1
        var l2Node = l2
        var carry = 0

        while (l1Node != null || l2Node != null) {
            val l1Value = l1Node?.`val` ?: 0
            val l2Value = l2Node?.`val` ?: 0
            val sumResult = l1Value + l2Value + carry
            carry = sumResult / 10

            val newNode = ListNode(sumResult % 10)
            currentNode.next = newNode
            currentNode = newNode

            l1Node = l1Node?.next
            l2Node = l2Node?.next
        }

        if (carry > 0) {
            currentNode.next = ListNode(carry)
        }

        return headNode.next
    }
}
