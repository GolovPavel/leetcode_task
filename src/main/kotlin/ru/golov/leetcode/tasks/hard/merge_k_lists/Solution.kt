package ru.golov.leetcode.tasks.hard.merge_k_lists

class Solution {

    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) {
            return null
        } else if (lists.size == 1) {
            return lists[0]
        }

        var head = mergeTwoLists(lists[0], lists[1])

        for (i in 2 until lists.size) {
            head = mergeTwoLists(head, lists[i])
        }

        return head
    }

    private fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummyHead = ListNode(0)
        var currentNode: ListNode? = dummyHead

        var list1Pointer = list1
        var list2Pointer = list2

        while (list1Pointer != null && list2Pointer != null) {
            if (list1Pointer.`val` < list2Pointer.`val`) {
                currentNode?.next = list1Pointer
                currentNode = currentNode?.next
                list1Pointer = list1Pointer.next
            } else {
                currentNode?.next = list2Pointer
                currentNode = currentNode?.next
                list2Pointer = list2Pointer.next
            }
        }

        if (list1Pointer == null) {
            currentNode?.next = list2Pointer
        }

        if (list2Pointer == null) {
            currentNode?.next = list1Pointer
        }

        return dummyHead.next
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}