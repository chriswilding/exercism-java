import java.util.stream.IntStream;

class SumOfMultiples {
    private final int sum;

    SumOfMultiples(int number, int[] set) {
        var setNotZero = IntStream.of(set).filter(n -> n != 0).toArray();

        sum = IntStream.range(1, number)
            .filter(candidate -> IntStream.of(setNotZero).anyMatch(multiple -> candidate % multiple == 0))
            .sum();
    }

    int getSum() {
        return sum;
    }

}
