package com.shailshah.ctci.solutions.treesgraphs;

import com.shailshah.ctci.datastructs.TreeNode;

public class FirstCommonAncestor {
    public TreeNode firstCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;

        TreeNode left = firstCommonAncestor(root.left, p, q);
        TreeNode right = firstCommonAncestor(root.right, p, q);

        if(left != null && right != null) return root;
        else return left != null ? left : right;
    }
}
