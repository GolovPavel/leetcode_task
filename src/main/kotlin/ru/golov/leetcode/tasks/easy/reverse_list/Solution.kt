package ru.golov.leetcode.tasks.easy.reverse_list

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var headPointer = head

        while (headPointer != null) {
            val nextNode = headPointer.next
            headPointer.next = prev
            prev = headPointer
            headPointer = nextNode
        }

        return prev
    }
}