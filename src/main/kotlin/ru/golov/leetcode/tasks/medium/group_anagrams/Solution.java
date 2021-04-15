package ru.golov.leetcode.tasks.medium.group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {
            var sortedString = sortStringChars(s);

            if (groups.containsKey(sortedString)) {
                groups.get(sortedString).add(s);
            } else {
                groups.put(sortedString, new ArrayList<>(Arrays.asList(s)));
            }
        }

        return new ArrayList<>(groups.values());
    }

    private String sortStringChars(String input) {
        var stringChars = input.toCharArray();
        Arrays.sort(stringChars);
        return new String(stringChars);
    }
}
