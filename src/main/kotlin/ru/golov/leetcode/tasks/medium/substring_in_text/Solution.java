package ru.golov.leetcode.tasks.medium.substring_in_text;

import java.util.HashMap;

public class Solution {

    /**
     * Дан текст T и строка S.
     * Требуется найти подстроку S' в T такую, что она совпадает с S с точностью до перестановки букв.
     *
     * @return Подстроку S'.
     */
    public String findSubStringInText(String text, String s) {
        if (text == null || s == null) {
            throw new IllegalArgumentException();
        }

        var cMap = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            cMap.put(c, cMap.getOrDefault(c, 0) + 1);
        }

        var start = 0;
        var end = 0;

        while (end - start < s.length()) {
            cMap.put(text.charAt(end), cMap.getOrDefault(text.charAt(end), 0) - 1);
            end++;
        }

        while (end < text.length()) {
            var isNotSubString = cMap.values().stream()
                    .anyMatch(v -> v != 0);

            if (isNotSubString) {
                cMap.put(text.charAt(start), cMap.get(text.charAt(start)) + 1);

                start++;
                end++;

                if (end > text.length() - 1) {
                    break;
                }

                cMap.put(text.charAt(end), cMap.getOrDefault(text.charAt(end), 0) - 1);
            }
        }

        return null;
    }
}
