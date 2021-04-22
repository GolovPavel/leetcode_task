
package ru.golov.leetcode.tasks.medium.merge_intervals;

import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    
    // f([1, 2]) -> [1, 2]
    // f([1, 2], [2, 3]) -> [1, 3]
    // f([1, 3], [2, 4]) -> [1, 4]
    // f([1, 3], [2, 4]) -> [1, 4]
    // f([1, 4], [2, 3]) -> [1, 4]
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        var mergedList = new LinkedList<int[]>();
        
        for (int[] interval : intervals) {
            if (mergedList.isEmpty() || mergedList.get(mergedList.size() - 1)[1] < interval[0]) {
                mergedList.add(interval);
            } else {
                mergedList.get(mergedList.size() - 1)[1] = Math.max(interval[1], mergedList.get(mergedList.size() - 1)[1]);
            }
        }
        
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}