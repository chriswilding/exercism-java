import java.util.regex.Pattern;

class IsbnVerifier {
    private static final int CODE_POINT_TEN = 88;

    boolean isValid(String stringToVerify) {
        var input = stringToVerify
            .codePoints()
            .filter(i -> Character.isDigit(i) || i == CODE_POINT_TEN)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();

        var p = Pattern.compile("^\\d{9}[\\d|X]$");
        var m = p.matcher(input);

        if (!m.matches()) {
            return false;
        }

        var checksum = 0;

        for (var i = 0; i < 10; i++) {
            var c = input.charAt(i);
            var digit = c == 'X' ? 10 : Character.getNumericValue(c);
            var multiplier = 10 - i;
            checksum += digit * multiplier;
        }

        return checksum % 11 == 0;
    }

}
