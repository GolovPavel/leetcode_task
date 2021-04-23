package ru.golov.leetcode.tasks.medium.path_sum_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<List<Integer>> pathSum(TreeNode root, Integer target) {
        var result = new LinkedList<List<Integer>>();
        var currentResult = new LinkedList<Integer>();

        getPaths(result, currentResult, root, target);

        return result;
    }

    private void getPaths(List<List<Integer>> result, List<Integer> currentResult, TreeNode node, Integer sum) {
        if (node == null) {
            return;
        }

        currentResult.add(node.val);

        if (node.left == null && node.right == null && node.val == sum) {
            result.add(new ArrayList<>(currentResult));
        } else {
            getPaths(result, currentResult, node.left, sum - node.val);
            getPaths(result, currentResult, node.right, sum - node.val);
        }

        currentResult.remove(currentResult.size() - 1);
    }
}

class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;
}
