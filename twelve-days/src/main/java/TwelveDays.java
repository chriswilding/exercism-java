import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class TwelveDays {
    Map<Integer, String> ordinals = Map.ofEntries(
        Map.entry(1, "first"),
        Map.entry(2, "second"),
        Map.entry(3, "third"),
        Map.entry(4, "fourth"),
        Map.entry(5, "fifth"),
        Map.entry(6, "sixth"),
        Map.entry(7, "seventh"),
        Map.entry(8, "eighth"),
        Map.entry(9, "ninth"),
        Map.entry(10, "tenth"),
        Map.entry(11, "eleventh"),
        Map.entry(12, "twelfth")
    );

    Map<Integer, String> gifts = Map.ofEntries(
        Map.entry(1, "a Partridge in a Pear Tree"),
        Map.entry(2, "two Turtle Doves"),
        Map.entry(3, "three French Hens"),
        Map.entry(4, "four Calling Birds"),
        Map.entry(5, "five Gold Rings"),
        Map.entry(6, "six Geese-a-Laying"),
        Map.entry(7, "seven Swans-a-Swimming"),
        Map.entry(8, "eight Maids-a-Milking"),
        Map.entry(9, "nine Ladies Dancing"),
        Map.entry(10, "ten Lords-a-Leaping"),
        Map.entry(11, "eleven Pipers Piping"),
        Map.entry(12, "twelve Drummers Drumming")
    );

    String verse(int verseNumber) {
        var sb = new StringBuilder();
        sb.append("On the ");
        sb.append(ordinals.get(verseNumber));
        sb.append(" day of Christmas my true love gave to me: ");
        for (var i = verseNumber; i > 0; i--) {
            sb.append(gifts.get(i));
            if (i > 1) {
                sb.append(", ");
            }
            if (i == 2) {
                sb.append("and ");
            }
        }
        sb.append(".\n");
        return sb.toString();
    }

    String verses(int startVerse, int endVerse) {
        return IntStream.rangeClosed(startVerse, endVerse)
            .mapToObj(this::verse)
            .collect(Collectors.joining("\n"));
    }

    String sing() {
        return verses(1, 12);
    }
}
