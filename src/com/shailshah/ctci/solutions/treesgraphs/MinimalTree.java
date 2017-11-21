package com.shailshah.ctci.solutions.treesgraphs;

import com.shailshah.ctci.datastructs.TreeNode;

public class MinimalTree {
    public TreeNode minimalTree(int[] nums) {
        return minimalTree(nums, 0, nums.length-1);
    }

    private TreeNode minimalTree(int[] a, int i, int j) {
        if(i > j) return null;
        int mid = (i + j) / 2;
        TreeNode root = new TreeNode(a[mid]);
        root.left = minimalTree(a, i, mid-1);
        root.right = minimalTree(a, mid+1, j);
        return root;
    }
}
