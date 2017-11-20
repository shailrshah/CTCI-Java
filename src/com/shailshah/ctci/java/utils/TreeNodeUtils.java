package com.shailshah.ctci.java.utils;

import com.shailshah.ctci.java.datastructs.TreeNode;

public class TreeNodeUtils {
    public int getHeight(TreeNode root) {
        if(root == null)
            return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
