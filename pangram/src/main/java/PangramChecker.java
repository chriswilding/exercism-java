import java.util.stream.Collectors;

public class PangramChecker {

    public boolean isPangram(String input) {
        if (input.isEmpty()) {
            return false;
        }

        var size = input
            .toLowerCase()
            .chars()
            .mapToObj(i -> (char) i)
            .filter(Character::isAlphabetic)
            .collect(Collectors.toSet())
            .size();

        return size == 26;
    }

}
