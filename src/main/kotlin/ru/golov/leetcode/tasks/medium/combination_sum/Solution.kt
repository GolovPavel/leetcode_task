package ru.golov.leetcode.tasks.medium.combination_sum

class Solution {

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()

        if (candidates.isEmpty() || target == 0) {
            return result
        }

        backtrack(candidates, 0, target, mutableListOf(), result)
        return result
    }

    private fun backtrack(candidates: IntArray, start: Int, target: Int, subList: MutableList<Int>, result: MutableList<MutableList<Int>>) {
        if (target < 0) {
            return
        } else if (target == 0) {
            result.add(ArrayList(subList))
        }

        for (i in start until candidates.size) {
            subList.add(candidates[i])
            backtrack(candidates, i, target - candidates[i], subList, result)
            subList.removeAt(subList.size - 1)
        }
    }
}