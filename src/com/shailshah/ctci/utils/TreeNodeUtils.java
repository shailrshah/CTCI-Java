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

    public boolean isSame(TreeNode a, TreeNode b) {
        if(a == null && b == null) return true;
        if(a == null || b == null || a.val != b.val) return false;
        return isSame(a.left, b.left) && isSame(a.right, b.right);
    }

    String delimiter = " ";
    String nullSymbol = "*";
    public String serializeTree(TreeNode root) {
        if(root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            sb.append(curr == null ? nullSymbol : curr.val);
            sb.append(delimiter);
            if(curr != null) {
                queue.add(curr.left); // can be null
                queue.add(curr.right); // can be null
            }
        }

        // save some space by deleting child of last depth's leaf node's * nodes
        int i = sb.length()-1;
        while(sb.charAt(i)== ' ' || sb.charAt(i) == '*') i--;
        sb.delete(i+1, sb.length());

        return sb.toString();
    }
    // Get parent from queue, children from string
    public TreeNode deserializeTree(String s) {
        if(s.length() == 0) return null;

        String[] nodes = s.split(delimiter);
        int i = 0;
        TreeNode root = new TreeNode(Integer.parseInt(nodes[i++]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(i < nodes.length) {
            TreeNode parent = queue.poll();
            if(!nodes[i].equals(nullSymbol)) {
                parent.left = new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(parent.left);
            }
            i++;
            if(i < nodes.length && !nodes[i].equals(nullSymbol)){
                parent.right = new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(parent.right);
            }
            i++;
        }
        return root;
    }
}
