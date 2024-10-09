package TestDephFirstSearch;

import dev.berdox.Algorithm.BubbleSort.BubbleSort;
import dev.berdox.DataStructures.Graph.Edge;
import dev.berdox.DataStructures.Graph.Graph;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestDeph {
    @Test
    public void testDeph() {
        List<Edge> edges = Arrays.asList(new Edge(0, 1, 0), new Edge(0,2,0), new Edge(1, 0, 0), new Edge(1, 3, 0),
                new Edge(2, 0 ,0), new Edge(2,4,0), new Edge(2,5,0), new Edge(3, 1, 0), new Edge(4, 2, 0), new Edge(5, 2, 0));

        // call graph class Constructor to construct a graph
        Graph graph = new Graph(edges);
    }
}
