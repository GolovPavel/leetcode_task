package ru.golov.leetcode.tasks.easy.merge_two_lists

class Solution {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var currentL1: ListNode? = l1
        var currentL2: ListNode? = l2

        val resultHead = ListNode(0)
        var result: ListNode = resultHead

        while (currentL1 != null || currentL2 != null) {
            if (currentL1 == null) {
                result.next = currentL2
                break
            } else if (currentL2 == null) {
                result.next = currentL1
                break
            } else if (currentL1.`val` < currentL2.`val`) {
                result.next = ListNode(currentL1.`val`)
                result = result.next!!
                currentL1 = currentL1.next
            } else {
                result.next = ListNode(currentL2.`val`)
                result = result.next!!
                currentL2 = currentL2.next
            }
        }

        return resultHead.next
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
