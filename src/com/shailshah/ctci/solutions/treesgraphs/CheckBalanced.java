package com.shailshah.ctci.solutions.treesgraphs;

import com.shailshah.ctci.datastructs.TreeNode;
import com.shailshah.ctci.utils.TreeNodeUtils;

public class CheckBalanced {
    static TreeNodeUtils treeNodeUtils = new TreeNodeUtils();

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int leftHeight = treeNodeUtils.getHeight(root.left);
        int rightHeight = treeNodeUtils.getHeight(root.right);

        return Math.abs(leftHeight - rightHeight) < 2 &&
                isBalanced(root.left) &&
                isBalanced(root.right);
    }
}
