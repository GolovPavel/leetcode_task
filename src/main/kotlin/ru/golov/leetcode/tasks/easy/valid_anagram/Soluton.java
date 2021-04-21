package ru.golov.leetcode.tasks.easy.valid_anagram;

import java.util.Arrays;
import java.util.HashMap;

class Solution1 {
    public boolean isAnagram(String s, String t) {
        var sortedS = sortString(s);
        var sortedT = sortString(t);

        return sortedS.equals(sortedT);
    }

    private String sortString(String input) {
        var charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}

class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        var charArr = new char[26];

        for (int i = 0; i < s.length(); i++) {
            charArr[s.charAt(i) - 'a']++;
            charArr[t.charAt(i) - 'a']--;
        }

        for (char c : charArr) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}

class Solution3 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        var cMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            cMap.put(s.charAt(i), cMap.getOrDefault(s.charAt(i), 0) + 1);
            cMap.put(t.charAt(i), cMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (Character c : cMap.keySet()) {
            if (cMap.get(c) != 0) {
                return false;
            }
        }

        return true;
    }
}
