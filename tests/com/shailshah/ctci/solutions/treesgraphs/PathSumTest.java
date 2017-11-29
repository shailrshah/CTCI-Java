package com.shailshah.ctci.solutions.treesgraphs;

import com.shailshah.ctci.datastructs.TreeNode;
import com.shailshah.ctci.utils.TreeNodeUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PathSumTest {
    PathSum obj;
    @Before
    public void setUp() throws Exception {
        obj = new PathSum();
    }

    //10,5,-3,3,2,null,11,3,-2,null,1
    @Test
    public void pathSum() throws Exception {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(11);
        root.left.right = new TreeNode(2);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);

        assertEquals(3, obj.pathSum(root, 8));
    }

}