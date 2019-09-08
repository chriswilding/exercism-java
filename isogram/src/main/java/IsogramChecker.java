import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Set<Character> set = new HashSet<>();

        for (char c : phrase.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(c) && set.contains(c)) {
                return false;
            } else {
                set.add(c);
            }
        }

        return true;
    }

}
