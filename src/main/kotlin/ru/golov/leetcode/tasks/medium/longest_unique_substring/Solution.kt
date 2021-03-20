package ru.golov.leetcode.tasks.medium.longest_unique_substring

import kotlin.math.max

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var i = 0
        var j = 0
        val stringSize = s.length

        var maxWindowSize = 0
        val windowLetters = mutableSetOf<Char>()

        while (i < stringSize && j < stringSize) {
            if (!windowLetters.contains(s[j])) {
                windowLetters.add(s[j++])
                maxWindowSize = max(maxWindowSize, j - i)
            } else {
                windowLetters.remove(s[i++])
            }
        }

        return maxWindowSize
    }
}
