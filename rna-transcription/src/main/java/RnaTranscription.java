import java.util.Map;
import java.util.stream.Stream;

class RnaTranscription {
    private static Map<Character, Character> compliment = Map.of(
        'C', 'G',
        'G', 'C',
        'A', 'U',
        'T', 'A'
    );


    String transcribe(String dnaStrand) {
        return dnaStrand.chars()
            .mapToObj(i -> (char)i)
            .map(compliment::get)
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
            .toString();
    }

}
