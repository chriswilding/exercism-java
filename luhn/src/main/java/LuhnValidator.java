class LuhnValidator {

    boolean isValid(String candidate) {
        if (candidate.strip().equals("0")) {
            return false;
        }

        var checksum = 0;
        var index = 0;

        for (var i = candidate.length() - 1; i >= 0; i--) {
            var c = candidate.charAt(i);

            if (Character.isSpaceChar(c)) {
                continue;
            }

            if (!Character.isDigit(c)) {
                return false;
            }

            var digit = Character.digit(c, 10);

            if (index % 2 != 0) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }

            checksum += digit;
            index += 1;
        }

        return checksum % 10 == 0;
    }

}
