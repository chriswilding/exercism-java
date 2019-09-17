import java.util.*;

class ProteinTranslator {
    private static final Set<String> stopCodons = Set.of("UAA", "UAG", "UGA");
    private static final Map<String, String> codonToAminoAcid = Map.ofEntries(
        new AbstractMap.SimpleImmutableEntry<>("AUG", "Methionine"),
        new AbstractMap.SimpleImmutableEntry<>("UUU", "Phenylalanine"),
        new AbstractMap.SimpleImmutableEntry<>("UUC", "Phenylalanine"),
        new AbstractMap.SimpleImmutableEntry<>("UUA", "Leucine"),
        new AbstractMap.SimpleImmutableEntry<>("UUG", "Leucine"),
        new AbstractMap.SimpleImmutableEntry<>("UCU", "Serine"),
        new AbstractMap.SimpleImmutableEntry<>("UCC", "Serine"),
        new AbstractMap.SimpleImmutableEntry<>("UCA", "Serine"),
        new AbstractMap.SimpleImmutableEntry<>("UCG", "Serine"),
        new AbstractMap.SimpleImmutableEntry<>("UAU", "Tyrosine"),
        new AbstractMap.SimpleImmutableEntry<>("UAC", "Tyrosine"),
        new AbstractMap.SimpleImmutableEntry<>("UGU", "Cysteine"),
        new AbstractMap.SimpleImmutableEntry<>("UGC", "Cysteine"),
        new AbstractMap.SimpleImmutableEntry<>("UGG", "Tryptophan")
    );

    List<String> translate(String rnaSequence) {
        var aminoAcids = new ArrayList<String>();

        for (var i = 0; i < rnaSequence.length(); i += 3) {
            var codon = rnaSequence.substring(i, i + 3);

            if (stopCodons.contains(codon)) {
                return aminoAcids;
            }

            var aminoAcid = codonToAminoAcid.get(codon);
            aminoAcids.add(aminoAcid);
        }

        return aminoAcids;
    }
}
