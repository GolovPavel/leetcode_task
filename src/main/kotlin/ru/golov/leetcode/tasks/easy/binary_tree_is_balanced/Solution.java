package ru.golov.leetcode.tasks.easy.binary_tree_is_balanced;

class Solution {
    private boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        getHeightAndCheckBalanced(root);
        return isBalanced;
    }

    private int getHeightAndCheckBalanced(TreeNode node) {
        if (node == null || !isBalanced) {
            return -1;
        }

        var leftHeight = getHeightAndCheckBalanced(node.left);
        var rightHeight = getHeightAndCheckBalanced(node.right);
        var heightDiff = Math.abs(leftHeight - rightHeight);

        if (heightDiff > 1) {
            isBalanced = false;
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
}