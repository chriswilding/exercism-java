import java.util.stream.Stream;

class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        return Stream.of(phrase.split("[^a-zA-Z']+"))
            .filter(string -> !string.isEmpty())
            .map(part -> part.charAt(0))
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
            .toString()
            .toUpperCase();
    }

}
