package dev.berdox.DataStructures.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Graph {
    private List<List<Node>> adjList = new ArrayList<>();

    public Graph(List<Edge> edges) {
        for(int i = 0; i < edges.size(); i++) {
            adjList.add(i, new ArrayList<>());
        }

        for(Edge e : edges) {
            adjList.get(e.src).add(new  Node(e.dest, e.weight));
        }
    }

    public void addEdge(Edge edge) {
        if(edge.src > adjList.size()) {
            System.out.println("Vertex Source doesn't exit");
        } else {
            adjList.get(edge.src).add(new Node(edge.dest, edge.weight));
        }
    }

    public int graphSize() {
        return adjList.size();
    }

    public List<Node> getNeibourVertices(int vert) {
        if(adjList.size() > 1) {
            return adjList.get(vert);
        } else {
            // Handle the case where adjList doesn't have enough lists
            throw new IllegalArgumentException("adjList does not have a list of indexs bigger than 1");
        }
    }

    public Iterator<Node> listIterator(int vert) {
        return adjList.get(vert).listIterator();
    }

    public static void printGraph(Graph graph) {
        int srcVertex = 0;
        int listSize = graph.adjList.size();

        System.out.println("The contents of the graph: ");

        while(srcVertex < listSize) {
            for(Node edge : graph.adjList.get(srcVertex)) {
                System.out.print("Source Vertex:" + srcVertex + " ==> Neighbour Vertex:" + edge.getValue() + " Weight:" +  edge.getWeight() + " ||\t");
            }
            System.out.println();
            srcVertex++;
        }
    }
}
/*
class Main{
    public static void main (String[] args)    {
        // define edges of the graph
        List<Edge> edges = Arrays.asList(new Edge(0, 1, 2),new Edge(0, 2, 4),
                new Edge(1, 2, 4),new Edge(2, 0, 5), new Edge(2, 1, 4),
                new Edge(3, 2, 3), new Edge(4, 5, 1),new Edge(5, 4, 3));

        // call graph class Constructor to construct a graph
        Graph graph = new Graph(edges);

        //graph.addEdge(new Edge(5, 1, 0));

        // print the graph as an adjacency list
        Graph.printGraph(graph);
    }
}*/
