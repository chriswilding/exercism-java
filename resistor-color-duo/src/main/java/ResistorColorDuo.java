import java.util.Map;

class ResistorColorDuo {

    private static final Map<String, Integer> colorToNumber = Map.ofEntries(
        Map.entry("black", 0),
        Map.entry("brown", 1),
        Map.entry("red", 2),
        Map.entry("orange", 3),
        Map.entry("yellow", 4),
        Map.entry("green", 5),
        Map.entry("blue", 6),
        Map.entry("violet", 7),
        Map.entry("grey", 8),
        Map.entry("white", 9)
    );

    int value(String[] colors) {
        var first = colorToNumber.get(colors[0]);
        var second = colorToNumber.get(colors[1]);
        return (first * 10) + second;
    }
    
}
