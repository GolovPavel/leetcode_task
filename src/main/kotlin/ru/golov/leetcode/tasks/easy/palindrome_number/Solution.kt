package ru.golov.leetcode.tasks.easy.palindrome_number

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false
        }

        var revertedNumber = 0
        var mutableX = x

        while (revertedNumber < mutableX) {
            revertedNumber = revertedNumber * 10 + mutableX % 10
            mutableX /= 10
        }

        return mutableX == revertedNumber || mutableX == revertedNumber / 10
    }
}

