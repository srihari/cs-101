package cs101.datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private List<Edge> edges = new ArrayList<Edge>();
    private String value;

    public Vertex(String s) {
        value = s;
    }

    public void addEdge(String s) {
        edges.add(new Edge(s));
    }

    public String print() {
        String s = value;
        for (Edge edge : edges) {
            s += edge.print();
        }
        return s;
    }

    public int numberOfEdges() {
        return edges.size();
    }
}
