package com.shailshah.ctci.solutions.treesgraphs;

import com.shailshah.ctci.datastructs.TreeNode;
import com.shailshah.ctci.utils.TreeNodeUtils;

public class CheckBalanced {
    static TreeNodeUtils treeNodeUtils = new TreeNodeUtils();

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        return Math.abs(treeNodeUtils.getHeight(root.left) - treeNodeUtils.getHeight(root.right)) <= 1 &&
                isBalanced(root.left) &&
                isBalanced(root.right);
    }
}
