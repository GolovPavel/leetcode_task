package ru.golov.leetcode.tasks.medium.top_k_frequent_words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        var countMap = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        var heap = new PriorityQueue<String>((w1, w2) -> countMap.get(w1).equals(countMap.get(w2))
                ? w2.compareTo(w1)
                : (int) (countMap.get(w1) - countMap.get(w2)));

        for (String word : countMap.keySet()) {
            heap.add(word);

            if(heap.size() > k) {
                heap.poll();
            }
        }

        var result = new ArrayList<String>(k);

        while(!heap.isEmpty()) {
            result.add(0, heap.poll());
        }

        return result;
    }
}