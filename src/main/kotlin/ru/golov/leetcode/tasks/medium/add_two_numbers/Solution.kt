package ru.golov.leetcode.tasks.medium.add_two_numbers

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val resultNodeHead = ListNode(0)
        var resultCurrentNode: ListNode = resultNodeHead
        var carry = 0

        var left = l1
        var right = l2

        while (left != null || right != null) {
            val leftVal = left?.`val` ?: 0
            val rightVal = right?.`val` ?: 0
            val sum = leftVal + rightVal + carry

            carry = sum / 10

            val newNode = ListNode(sum % 10)
            resultCurrentNode.next = newNode
            resultCurrentNode = newNode

            left = left?.next
            right = right?.next
        }

        if (carry > 0) {
            resultCurrentNode.next = ListNode(1)
        }

        return resultNodeHead.next
    }
}
