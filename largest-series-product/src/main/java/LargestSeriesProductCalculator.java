import java.util.regex.Pattern;
import java.util.stream.Stream;

class LargestSeriesProductCalculator {

    private final int[] intArray;

    LargestSeriesProductCalculator(String inputNumber) {
        Pattern p = Pattern.compile("^\\d*$");
        var m = p.matcher(inputNumber);
        if (!m.matches()) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }

        intArray = new int[inputNumber.length()];

        for (var i = 0; i < inputNumber.length(); i++) {
            char c = inputNumber.charAt(i);
            intArray[i] = Character.getNumericValue(c);
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        if (numberOfDigits > intArray.length) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }

        var largest = 0L;

        for (var i = 0; i <= intArray.length - numberOfDigits; i++) {
            var product = 1L;
            for (var j = 0; j < numberOfDigits; j++) {
                var index = i + j;
                if (index < intArray.length) {
                    product *= intArray[index];
                }
            }

            if (product > largest) {
                largest = product;
            }
        }

        return largest;
    }

}
