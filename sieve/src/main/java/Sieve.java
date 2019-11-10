import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Sieve {

    private final List<Integer> primes;

    Sieve(int maxPrime) {
        if (maxPrime == 1) {
            primes = Collections.emptyList();
        } else {
            var two = IntStream.of(2);
            var rest = IntStream.iterate(3, n -> n < maxPrime + 1, n -> n + 2);
            primes = IntStream.concat(two, rest).boxed().collect(Collectors.toList());

            for (int i = 3; i < maxPrime; i++) {
                final int candidate = i;
                primes.removeIf(n -> n != candidate && n % candidate == 0);
            }
        }
    }

    List<Integer> getPrimes() {
        return primes;
    }

}
