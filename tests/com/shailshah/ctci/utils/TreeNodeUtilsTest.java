package com.shailshah.ctci.utils;

import com.shailshah.ctci.datastructs.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TreeNodeUtilsTest {
   TreeNodeUtils treeNodeUtils;
    TreeNode mockedTree;

    /* mockedTree
    *         1
    *     2       3
    *   4   5       6
    * 7       8
    * */
    @Before
    public void setUp() throws Exception {
        treeNodeUtils = new TreeNodeUtils();
        mockedTree = new TreeNode(1);
        mockedTree.left = new TreeNode(2);
        mockedTree.right = new TreeNode(3);
        mockedTree.left.left = new TreeNode(4);
        mockedTree.left.right = new TreeNode(5);
        mockedTree.right.right = new TreeNode(6);
        mockedTree.left.left.left = new TreeNode(7);
        mockedTree.left.right.right = new TreeNode(8);
    }

    @Test
    public void getHeight() throws Exception {
        assertEquals(3, treeNodeUtils.getHeight(mockedTree));
        assertEquals(-1, treeNodeUtils.getHeight(null));
        assertEquals(0, treeNodeUtils.getHeight(new TreeNode(1)));
    }

    @Test
    public void getNodesAtLevelK() throws Exception {
        List<TreeNode> nodes = treeNodeUtils.getNodesAtLevelK(mockedTree, 0);
        assertEquals(1, nodes.size());
        assertEquals(1, nodes.get(0).val);

        nodes = treeNodeUtils.getNodesAtLevelK(mockedTree, 1);
        assertEquals(2, nodes.size());
        assertEquals(2, nodes.get(0).val);
        assertEquals(3, nodes.get(1).val);

        nodes = treeNodeUtils.getNodesAtLevelK(mockedTree, 2);
        assertEquals(3, nodes.size());
        assertEquals(4, nodes.get(0).val);
        assertEquals(5, nodes.get(1).val);
        assertEquals(6, nodes.get(2).val);

        nodes = treeNodeUtils.getNodesAtLevelK(mockedTree, 3);
        assertEquals(2, nodes.size());
        assertEquals(7, nodes.get(0).val);
        assertEquals(8, nodes.get(1).val);

        nodes = treeNodeUtils.getNodesAtLevelK(mockedTree, 4);
        assertTrue(nodes.isEmpty());
    }

    @Test
    public void getAllLevels() throws Exception {
        List<List<TreeNode>> levels = treeNodeUtils.getAllLevels(mockedTree);
        assertEquals(4, levels.size());
        assertEquals(1, levels.get(0).size());
        assertEquals(2, levels.get(1).size());
        assertEquals(3, levels.get(2).size());
        assertEquals(2, levels.get(3).size());
    }

    @Test
    public void serializeTree() throws Exception {
        String serializedTree = treeNodeUtils.serializeTree(mockedTree);
        assertEquals("1, 2, 3, 4, 5, *, 6, 7, *, *, 8", serializedTree);
        TreeNode root = treeNodeUtils.deserializeTree(serializedTree);
        assertTrue(treeNodeUtils.isSame(root, mockedTree));

        assertEquals(null, treeNodeUtils.deserializeTree(""));
    }
}