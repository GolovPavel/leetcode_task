package ru.golov.leetcode.tasks.easy.reverse_integer

class Solution {

    fun reverse(x: Int): Int {
        var result = 0
        var remainder = x

        while (remainder != 0) {
            val lastDigit = remainder % 10
            remainder /= 10

            if (result > Int.MAX_VALUE / 10 || (result == Int.MAX_VALUE && lastDigit > 7)) return 0
            if (result < Int.MIN_VALUE / 10 || (result == Int.MIN_VALUE && lastDigit < 8)) return 0

            result = result * 10 + lastDigit
        }

        return result
    }
}
