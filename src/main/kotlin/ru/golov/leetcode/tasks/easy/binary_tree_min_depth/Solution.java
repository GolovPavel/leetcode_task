package ru.golov.leetcode.tasks.easy.binary_tree_min_depth;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        var leftMin = minDepth(root.left);
        var rightMin = minDepth(root.right);

        return 1 + (leftMin > 0 && rightMin > 0 ? Math.min(leftMin, rightMin) : Math.max(leftMin, rightMin));
    }
}