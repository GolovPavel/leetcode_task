package ru.golov.leetcode.tasks.medium.longest_repeating_character_replacement;

class Solution {
    public int characterReplacement(String s, int k) {
        var count = new int[26];
        var maxFreqCount = 0;
        var result = 0;
        var start = 0;
        
        for (int end = 0; end < s.length(); end++) {
            count[s.charAt(end) - 'A']++;
            maxFreqCount = Math.max(maxFreqCount, count[s.charAt(end) - 'A']);
            var replacesNeed = end - start + 1 - maxFreqCount;
            
            if (replacesNeed > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            } else {
                result = Math.max(result, end - start + 1);
            }
        }
        
        return result;
    }
}