import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Allergies {

    private final int score;

    Allergies(int score) {
        this.score = score;
    }

    List<Allergen> getList() {
        return Stream.of(Allergen.values())
            .filter(this::isAllergicTo)
            .collect(Collectors.toList());
    }

    boolean isAllergicTo(Allergen allergen) {
        return (allergen.getScore() & score) > 0;
    }

}
