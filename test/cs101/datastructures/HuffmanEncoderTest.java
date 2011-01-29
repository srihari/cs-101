package cs101.datastructures;

import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;

public class HuffmanEncoderTest {


    @Test
    public void shouldEncodeTheString() {
        HashMap<String, Integer> frequencyDistribution = new HashMap<String, Integer>();
        frequencyDistribution.put("A", 5);
        frequencyDistribution.put("B", 7);
        frequencyDistribution.put("C", 10);
        frequencyDistribution.put("D", 15);
        frequencyDistribution.put("E", 20);
        frequencyDistribution.put("F", 45);
        HuffmanEncoder encoder = new HuffmanEncoder(frequencyDistribution);
        assertEquals("010", encoder.encode("D"));
    }
}
