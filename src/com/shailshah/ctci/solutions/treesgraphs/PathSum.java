package com.shailshah.ctci.solutions.treesgraphs;

import com.shailshah.ctci.datastructs.TreeNode;

public class PathSum {
    public int pathSum(TreeNode root, int target) {
        if(root == null) return 0;
        return addSum(root, 0, target) +
                pathSum(root.left, target) +
                pathSum(root.right, target);
    }

    private int addSum(TreeNode root, int curr, int target) {
        if(root == null) return 0;
        curr += root.val;
        return (curr == target ? 1 : 0) +
                addSum(root.left, curr, target) +
                addSum(root.right, curr, target);
    }
}