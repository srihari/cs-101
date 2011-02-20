package cs101.datastructures.binarytrees.huffman;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HuffmanEncoderTest {

    @Test
    public void shouldEncodeTheString() {
        FrequencyDistribution distribution = new FrequencyDistribution();
        distribution.put("A", 5);
        distribution.put("B", 7);
        distribution.put("C", 10);
        distribution.put("D", 15);
        distribution.put("E", 20);
        distribution.put("F", 45);
        HuffmanEncoder encoder = new HuffmanEncoder(distribution);
        assertEquals("010", encoder.encode("D"));
    }
}
