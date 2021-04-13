package ru.golov.leetcode.tasks.easy.binary_search_algorithms.guess_game

import kotlin.random.Random

/**
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return         -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */
abstract class GuessGame {

    private var secretNumber = 0

    abstract fun guessNumber(n: Int): Int

    fun guessGame(n: Int): Int {
        secretNumber = Random.nextInt(0, n + 1)
        return guessNumber(n)
    }

    fun guess(num: Int): Int {
        return when {
            num > secretNumber -> -1
            num < secretNumber -> 1
            else -> 0
        }
    }
}

/**
 *   f(1), 1
 *   f(2), 1
 *   f(2), 2
 *   f(5), 2
 *   f(5), 4
 */
class Solution : GuessGame() {
    override fun guessNumber(n: Int): Int {
        var start = 0
        var end = n

        while (start <= end) {
            val pivot = start + (end - start) / 2
            val suggestion = guess(pivot)

            when {
                suggestion < 0 -> {
                    end = pivot - 1
                }
                suggestion > 0 -> {
                    start = pivot + 1
                }
                else -> {
                    return pivot
                }
            }
        }

        return -1
    }
}