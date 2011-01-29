package cs101.datastructures;

import java.util.HashMap;

public class HuffmanEncoder {

    private HashMap<String, Integer> frequencyDistribution;

    public HuffmanEncoder(HashMap<String, Integer> frequencyDistribution) {
        this.frequencyDistribution = frequencyDistribution;
    }

    public String encode(String word) {
        HuffmanTree tree = createTree(frequencyDistribution);
        return "";
    }

    HuffmanTree createTree(HashMap<String, Integer> frequencyDistribution) {

        return new HuffmanTree();
    }
}
