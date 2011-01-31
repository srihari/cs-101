package cs101.datastructures.binarytrees;

public class HuffmanTree {
    private Node root;

    public HuffmanTree(Node root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "HuffmanTree{" +
                "root=" + root +
                '}';
    }

    public static class Node implements Comparable<Node> {
        private String term;
        private Integer frequency;
        private Node left;
        private Node right;

        public Node(String term, Integer frequency) {
            this.term = term;
            this.frequency = frequency;
        }

        public Node(Node first, Node second) {
            this.term = null;
            this.frequency = first.frequency + second.frequency;
            this.left = first;
            this.right = second;
        }

        public int compareTo(Node other) {
            return this.frequency - other.frequency;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "term='" + term + '\'' +
                    ", frequency=" + frequency +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

}
