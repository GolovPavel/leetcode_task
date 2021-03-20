package ru.golov.leetcode.tasks.easy.roman_to_integer

class Solution {

    fun romanToInt(s: String): Int {
        var result = 0

        var i = 0
        while (i < s.length) {
            val currentNumber = convertRomeToArabicNumber(s[i])

            if (i >= s.length - 1) {
                result += currentNumber
            } else {
                val nextNumber = convertRomeToArabicNumber(s[i + 1])

                if (nextNumber > currentNumber) {
                    result += nextNumber - currentNumber
                    i++
                } else {
                    result += currentNumber
                }
            }
            i++
        }

        return result
    }

    private fun convertRomeToArabicNumber(arabicNumber: Char): Int = when (arabicNumber) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }
}
