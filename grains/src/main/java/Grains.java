import java.math.BigInteger;
import java.util.stream.IntStream;

class Grains {

    BigInteger computeNumberOfGrainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return BigInteger.TWO.pow(square - 1);
    }

    BigInteger computeTotalNumberOfGrainsOnBoard() {
        return IntStream.range(1, 65)
                .mapToObj(this::computeNumberOfGrainsOnSquare)
                .reduce(BigInteger::add)
                .get();
    }

}
