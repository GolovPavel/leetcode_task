package ru.golov.leetcode.tasks.easy.linked_list_cycle

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {

    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) {
            return false
        }

        var walker = head
        var runner = head

        while (walker?.next != null && runner?.next?.next != null) {
            walker = walker.next
            runner = runner.next?.next

            if (walker == runner) {
                return true
            }
        }

        return false
    }
}