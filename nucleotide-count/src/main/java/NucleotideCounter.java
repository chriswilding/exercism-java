import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class NucleotideCounter {
    private Map<Character, Integer> nucleotideCounts =  new HashMap<>(Map.of(
        'A', 0,
        'C', 0,
        'G', 0,
        'T', 0
    ));

    private Set<Character> validNucleotides = nucleotideCounts.keySet();

    NucleotideCounter(String strand) {
        for (char nucleotide : strand.toCharArray()) {
            if (!validNucleotides.contains(nucleotide)) {
                throw new IllegalArgumentException();
            }
            nucleotideCounts.compute(nucleotide, (k, v) -> v + 1);
        }
    }

    public Map<Character, Integer> nucleotideCounts() {
        return nucleotideCounts;
    }
}
