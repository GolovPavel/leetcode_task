package ru.golov.leetcode.tasks.easy.urlify;

public class Solution {

    /**
     * Inplace заменяет в массиве символы пробела на последовательность символов '%', '2', '0'.
     *
     * @param str Массив символов с исходной последовательностью и запасом под расширение последовательности.
     * @param len Длина исходной последовательности символов.
     * @return Новая длина последовательности символов.
     */
    public int urlify(char[] str, int len) {
        if (str == null || len > str.length || len < 0) {
            throw new IllegalArgumentException();
        }

        var spaces = 0;

        for (char c : str) {
            if (c == ' ') {
                spaces++;
            }
        }

        var newLength = len + spaces * 2;

        if (newLength < len) {
            throw new IllegalArgumentException();
        }

        var start = len - 1;
        var end = len - 1 + spaces * 2;

        while (start != end) {
            if (str[start] == ' ') {
                str[end--] = '0';
                str[end--] = '2';
                str[end--] = '%';
                start--;
            } else {
                str[end--] = str[start--];
            }
        }

        return newLength;
    }
}
