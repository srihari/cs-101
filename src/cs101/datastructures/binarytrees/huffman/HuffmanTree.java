package cs101.datastructures.binarytrees.huffman;

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

    public String codeFor(String character) {
        TreeWalker walker = new TreeWalker();
        root.find(character, walker);
        return walker.code();
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

        public Node find(String character, TreeWalker walker) {
            Node key = null;
            if (isLeaf() && term.equals(character)) return this;
            else if (left != null) {
                key = left.find(character, walker);
            } else if (right != null) {
                key = right.find(character, walker);
            }
            return key;
        }

        public boolean isLeaf() {
            return this.term != null;
        }
    }

    private static class TreeWalker {
        private StringBuffer code = new StringBuffer();

        public String code() {
            return code.toString();
        }

        public void goLeft() {
            code.append(0);
        }

        public void goRight() {
            code.append(1);
        }
    }
}
