package com.shailshah.ctci.utils;

import com.shailshah.ctci.datastructs.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNodeUtils {
    public int getHeight(TreeNode root) {
        if(root == null)
            return -1;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public List<TreeNode> getNodesAtLevelK(TreeNode root, int k) {
        return getNodesAtLevelK(root, k, 0, new ArrayList<>());
    }

    private List<TreeNode> getNodesAtLevelK(TreeNode root, int k, int level, List<TreeNode>nodes) {
        if(root == null || level > k)
            return nodes;

        if(level == k) {
            nodes.add(root);
            return nodes;
        }

        nodes = getNodesAtLevelK(root.left, k, level + 1, nodes);
        nodes = getNodesAtLevelK(root.right, k, level + 1, nodes);

        return nodes;
    }

    public List<List<TreeNode>> getAllLevels(TreeNode root) {
        List<List<TreeNode>> levels = new ArrayList<>();
        if(root == null) return levels;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<TreeNode> level = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }

            levels.add(level);
        }

        return levels;
    }
}
