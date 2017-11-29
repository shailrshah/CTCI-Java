package com.shailshah.ctci.datastructs;

import java.util.*;

public class Graph {
    class Edge {
        int a;
        int b;
        int weight;

        Edge(int a, int b, int weight) {
            this.a = a;
            this.b = b;
            this.weight = weight;
        }
    }

    Map<Integer, Set<Edge>> edges;
    boolean isDirected;

    public Graph(boolean isDirected) {
        edges = new HashMap<>();
        this.isDirected = isDirected;
    }

    public void addEdge(int a, int b, int weight) {
        edges.get(a).add(new Edge(a, b, weight));
        if(!isDirected)
            edges.get(b).add(new Edge(b, a, weight));
    }

    public Edge findEdge(int a, int b) {
        for(Edge e : edges.get(a))
            if(e.b == b)
                return e;

        return null;
    }

    public void deleteEdge(int a, int b) {
        edges.remove(findEdge(a, b));
        if(!isDirected)
            edges.remove(findEdge(b, a));
    }

    public List<Integer> getNeighbours(int a) {
        List<Integer> neighbours = new ArrayList<>();
        for(Edge e : edges.get(a))
            neighbours.add(e.b);
        return neighbours;
    }
}
