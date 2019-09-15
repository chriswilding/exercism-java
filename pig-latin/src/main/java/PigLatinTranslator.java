import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class PigLatinTranslator {
    private List<String> vowels = List.of("a", "e", "i", "o", "u", "yt", "xr", "xy");
    private List<String> consonantClusters = List.of("thr", "sch", "th", "ch", "rh", "qu");

    public String translate(String phrase) {
        var words = phrase.split(" ");
        return Stream.of(words)
            .map(this::toPigLatin)
            .collect(Collectors.joining(" "));
    }

    private String toPigLatin(String word) {
        var sb = new StringBuilder();

        for (var vowel : vowels) {
            if (word.startsWith(vowel)) {
                sb.append(word);
                sb.append("ay");
                return sb.toString();
            }
        }

        for (var consonantCluster : consonantClusters) {
            if (word.startsWith(consonantCluster)) {
                sb.append(word.substring(consonantCluster.length()));
                sb.append(consonantCluster);
                sb.append("ay");
                return sb.toString();
            }
        }

        if (word.length() > 2 && word.substring(1, 3).equals("qu")) {
            sb.append(word.substring(3));
            sb.append(word.charAt(0));
            sb.append("quay");
            return sb.toString();
        }

        sb.append(word.substring(1));
        sb.append(word.charAt(0));
        sb.append("ay");
        return sb.toString();
    }
}
