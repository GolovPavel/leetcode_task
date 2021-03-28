package ru.golov.leetcode.tasks.easy.fizz_buzz

class Solution {

    fun fizzBuzz(n: Int): List<String> {
        return (1..n).map {
            val dividedByThree = it % 3 == 0
            val dividedByFive = it % 5 == 0

            when {
                dividedByThree && dividedByFive -> {
                    "FizzBuzz"
                }
                dividedByThree -> {
                    "Fizz"
                }
                dividedByFive -> {
                    "Buzz"
                }
                else -> {
                    it.toString()
                }
            }
        }
    }
}