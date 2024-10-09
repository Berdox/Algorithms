package dev.berdox.Algorithm.DephFirstSearch;

import dev.berdox.DataStructures.Graph.Graph;
import dev.berdox.DataStructures.Graph.Node;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


// uncommenting the code can switch this dfs from a set to a boolean array for visited nodes
public class DephFirstSearch {

    /**
     * Depth-First Search (DFS) is a graph traversal algorithm that explores as far as possible
     * along each branch before backtracking.
     *
     * Time Complexity:
     * - O(V + E), where V is the number of vertices and E is the number of edges.
     *
     * Space Complexity:
     * - O(V) - for storing the visited nodes in a HashSet.
     *
     * @param vertNumStart the starting vertex number for DFS
     * @param graph        the graph to perform DFS on
     */
    public static void DFS(int vertNumStart, Graph graph) {
        //boolean[] vistedNodes = new boolean[graph.graphSize()];
        Set<Integer> visitedNodes = new HashSet<>();  // Set to store visited nodes
        DFSRecursive(vertNumStart, graph, visitedNodes);  // Call the recursive DFS method
    }

    /**
     * Recursive helper method for DFS traversal.
     *
     * @param vertNum     the current vertex number
     * @param graph       the graph to perform DFS on
     * @param visitedNodes set of visited nodes
     */
                                                //boolean[] vistedNodes
    public static void DFSRecursive(int vertNum, Graph graph, Set<Integer> visitedNodes) {
        //vistedNodes[vertNum] = true;
        visitedNodes.add(vertNum); // Mark the vertex as visited
        System.out.print(vertNum + " ");  // Print the current vertex

        // Get an iterator for the adjacent nodes of the current vertex
        Iterator<Node> iterator = graph.listIterator(vertNum);

        // Iterate through the adjacent nodes
        while (iterator.hasNext()) {
            Node node = iterator.next();
            // If the adjacent node is not visited, mark it as visited and recursively call DFS
            if (!visitedNodes.contains(node.getValue())) {
                DFSRecursive(node.getValue(), graph, visitedNodes);
            }
            /*if(!vistedNodes[n.getValue()]) {
                DFSRecursive(n.getValue(), graph, vistedNodes);
            }*/
        }
    }
}
