package cs101.datastructures;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HuffmanEncoder {

    private FrequencyDistribution distribution;

    public HuffmanEncoder(FrequencyDistribution distribution) {
        this.distribution = distribution;
    }

    public String encode(String word) {
        HuffmanTree tree = createTree(distribution);
        return "";
    }

    HuffmanTree createTree(FrequencyDistribution frequencyDistribution) {
        TreeSet<HuffmanTree.Node> initialNodes = preliminaryNodes(frequencyDistribution);
        while (initialNodes.size() != 1) {
            HuffmanTree.Node first = initialNodes.pollFirst();
            HuffmanTree.Node second = initialNodes.pollFirst();
            initialNodes.add(new HuffmanTree.Node(first, second));
        }
        return new HuffmanTree(initialNodes.pollFirst());
    }

    private TreeSet<HuffmanTree.Node> preliminaryNodes(FrequencyDistribution frequencyDistribution) {
        Set<Map.Entry<String, Integer>> entries = frequencyDistribution.getTerms().entrySet();

        TreeSet<HuffmanTree.Node> treeSet = new TreeSet<HuffmanTree.Node>();
        for (Map.Entry<String, Integer> entry : entries) {
            treeSet.add(new HuffmanTree.Node(entry.getKey(), entry.getValue()));
        }
        return treeSet;
    }
}
