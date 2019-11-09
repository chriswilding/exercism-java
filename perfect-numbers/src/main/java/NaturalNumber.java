import java.util.stream.IntStream;

class NaturalNumber {

    private final Classification classification;

    NaturalNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

        var limit = number / 2 + 1;
        var sum = IntStream.range(1, limit)
            .filter(i -> number % i == 0)
            .sum();

        if (sum == number) {
            classification = Classification.PERFECT;
        } else if (sum > number) {
            classification = Classification.ABUNDANT;
        } else {
            classification = Classification.DEFICIENT;
        }
    }

    public Classification getClassification() {
        return classification;
    }

}
