import java.util.stream.Collectors;

class Bob {
    String hey(String statement) {
        var input = statement.trim();

        if (isSilence(input)) return "Fine. Be that way!";

        var question = isQuestion(input);
        var yell = isYell(input);

        if (question && yell) return "Calm down, I know what I'm doing!";
        if (question) return "Sure.";
        if (yell) return "Whoa, chill out!";

        return "Whatever.";
    }

    private boolean isSilence(String input) {
        return input.isBlank();
    }

    private boolean isQuestion(String input) {
        return input.endsWith("?");
    }

    private boolean isYell(String input) {
        var anyAlphabetic = false;
        var allUpperCase = true;

        for (var c: input.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                anyAlphabetic = true;

                if (!Character.isUpperCase(c)) {
                    allUpperCase = false;
                }
            }
        }

        return anyAlphabetic && allUpperCase;
    }
}
