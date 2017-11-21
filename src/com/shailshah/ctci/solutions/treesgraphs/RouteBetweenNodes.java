package com.shailshah.ctci.solutions.treesgraphs;

import com.shailshah.ctci.datastructs.Graph;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class RouteBetweenNodes {
    boolean isPath(Graph g, int a, int b) {
        if(a == b) return true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(a);
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            List<Integer> neighbours = g.getNeighbours(curr);
            if(neighbours.contains(b)) return true;
            else queue.addAll(neighbours);
        }
        return false;
    }
}


