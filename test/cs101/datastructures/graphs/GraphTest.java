package cs101.datastructures.graphs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphTest {

    @Test
    public void createAdjacencyListUndirectedGraph() {
        AdjacencyListGraph graph = new AdjacencyListGraph(GraphType.UNDIRECTED);
        graph.addEdge("A", "C");
        graph.addEdge("A", "F");
        graph.addEdge("B", "C");
        graph.addEdge("B", "F");
        graph.addEdge("D", "E");
        assertEquals(6, graph.vertices());
        System.out.println(graph.print());
    }

    @Test
    public void createAdjacencyListDirectedGraph() {
        AdjacencyListGraph graph = new AdjacencyListGraph(GraphType.DIRECTED);
        graph.addEdge("A", "B");
        assertEquals(1, graph.vertices());
    }
}
