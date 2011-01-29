package cs101.datastructures;

import java.util.HashMap;

public class FrequencyDistribution {
    private HashMap<String, Integer> terms = new HashMap<String, Integer>();

    public void put(String term, int frequency) {
        terms.put(term, frequency);
    }

    public HashMap<String, Integer> getTerms() {
        return terms;
    }
}
