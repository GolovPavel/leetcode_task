
package ru.golov.leetcode.tasks.easy.binary_tree_is_same_tree;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        return p.val == q.val
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}