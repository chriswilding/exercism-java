class Bob {
    String hey(String input) {
        var silence = input.isBlank();
        if (silence) return "Fine. Be that way!";

        var question = input.trim().endsWith("?");
        var yell = !input.equals(input.toLowerCase()) && input.equals(input.toUpperCase());

        if (question && yell) return "Calm down, I know what I'm doing!";
        if (question) return "Sure.";
        if (yell) return "Whoa, chill out!";

        return "Whatever.";
    }
}
