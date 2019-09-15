import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {
    private String input;
    private Map<Character, Long> inputCharCount;

    public Anagram(String input) {
        this.input = input;
        this.inputCharCount = charCount(input);
    }

    public List<String> match(List<String> candidates) {
        return candidates
            .stream()
            .filter((candidate) -> !candidate.equalsIgnoreCase(input))
            .filter(this::isAnagram)
            .collect(Collectors.toList());
    }

    private boolean isAnagram(String candidate) {
        var candidateCharCount = this.charCount(candidate);
        return inputCharCount.equals(candidateCharCount);
    }

    private Map<Character, Long> charCount(String input) {
        return input
            .toLowerCase()
            .chars()
            .mapToObj(i -> (char) i)
            .filter(Character::isAlphabetic)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
