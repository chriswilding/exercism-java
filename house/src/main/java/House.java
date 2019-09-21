import java.util.ArrayList;
import java.util.List;

class House {
    private final List<String> things = new ArrayList<>();
    private final List<String> verbs = new ArrayList<>();

    public House() {
        things.add("the house");
        things.add("the malt");
        things.add("the rat");
        things.add("the cat");
        things.add("the dog");
        things.add("the cow with the crumpled horn");
        things.add("the maiden all forlorn");
        things.add("the man all tattered and torn");
        things.add("the priest all shaven and shorn");
        things.add("the rooster that crowed in the morn");
        things.add("the farmer sowing his corn");
        things.add("the horse and the hound and the horn");

        verbs.add("that Jack built.");
        verbs.add("that lay in");
        verbs.add("that ate");
        verbs.add("that killed");
        verbs.add("that worried");
        verbs.add("that tossed");
        verbs.add("that milked");
        verbs.add("that kissed");
        verbs.add("that married");
        verbs.add("that woke");
        verbs.add("that kept");
        verbs.add("that belonged to");
    }

    String sing() {
        return verses(1, 12);
    }

    String verse(int n) {
        var sb = new StringBuilder();
        sb.append("This is ");

        for (var i = n - 1; i > -1; i--) {
            sb.append(things.get(i));
            sb.append(" ");
            sb.append(verbs.get(i));
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    String verses(int from, int to) {
        var sb = new StringBuilder();

        for (var i = from; i < to + 1; i++) {
            sb.append(verse(i));
            sb.append("\n");
        }

        return sb.toString().trim();
    }
}
