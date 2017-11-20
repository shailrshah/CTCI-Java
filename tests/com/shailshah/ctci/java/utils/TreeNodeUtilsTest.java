package com.shailshah.ctci.java.utils;

import com.shailshah.ctci.java.datastructs.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeNodeUtilsTest {
    TreeNodeUtils treeNodeUtils;
    @Before
    public void setUp() throws Exception {
        treeNodeUtils = new TreeNodeUtils();
    }

    @Test
    public void getHeight() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);

        assertEquals(3, treeNodeUtils.getHeight(root));
        assertEquals(0, treeNodeUtils.getHeight(null));
    }
}