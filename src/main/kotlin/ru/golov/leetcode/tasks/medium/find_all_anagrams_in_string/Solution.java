package ru.golov.leetcode.tasks.medium.find_all_anagrams_in_string;

import java.util.List;
import java.util.ArrayList;

class Solution {

    // f("a", "a") -> [0]
    // f("ab", "a") -> [0]
    // f("ba", "a") -> [1]
    // f("abccba", "abc") -> [0, 3]
    // f("abba", "ab") -> [0, 2]
    // f("cbaebabacd", "abc") -> [0, 6]
    public List<Integer> findAnagrams(String s, String p) {
        var count = new int[26];
        var result = new ArrayList<Integer>();

        for (int i = 0; i < p.length(); i++) {
            count[p.charAt(i) - 'a']++;
        }

        var start = 0;

        for (int end = 0; end < s.length(); end++) {
            count[s.charAt(end) - 'a']--;

            if (end - start + 1 < p.length()) {
                continue;
            }

            var isAnagram = true;

            for (int c : count) {
                if (c != 0) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                result.add(start);
            }

            count[s.charAt(start) - 'a']++;
            start++;
        }

        return result;
    }
}