package ru.golov.leetcode.tasks.easy.valid_parentheses

import java.util.Stack

class Solution {

    fun isValid(s: String): Boolean {
        val stack: Stack<Char> = Stack()

        for (bracket in s) {
            if (bracket in BRACKETS) {
                if (stack.isEmpty() || stack.pop() != BRACKETS[bracket]) {
                    return false
                }
            } else {
                stack.push(bracket)
            }
        }

        return stack.isEmpty()
    }

    companion object {
        val BRACKETS: Map<Char, Char> = mapOf(
            '}' to '{',
            ']' to '[',
            ')' to '('
        )
    }
}
