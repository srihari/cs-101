package cs101.datastructures.graphs;

import java.util.HashMap;
import java.util.Map;

public class AdjacencyListGraph {
    private GraphType type;
    private Map<String, Vertex> vertices = new HashMap<String, Vertex>();

    public AdjacencyListGraph(GraphType type) {
        this.type = type;
    }

    public void addEdge(String first, String second) {
        if (type == GraphType.UNDIRECTED) {
            createVertex(first, second);
            createVertex(second, first);
        } else if ((type == GraphType.DIRECTED)) {
            createVertex(first, second);
        }
    }

    private void createVertex(String first, String second) {
        if (vertices.containsKey(first)) {
            vertices.get(first).addEdge(second);
        } else {
            vertices.put(first, new Vertex(first));
        }
    }

    public int vertices() {
        return vertices.size();
    }

    public String print() {
        return null;
    }
}
