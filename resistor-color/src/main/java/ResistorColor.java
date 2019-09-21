import java.util.Arrays;

class ResistorColor {
    private enum Color {
        black,
        brown,
        red,
        orange,
        yellow,
        green,
        blue,
        violet,
        grey,
        white
    }

    int colorCode(String color) {
        return Color.valueOf(color).ordinal();
    }

    String[] colors() {
        return Arrays.stream(Color.values()).map(Enum::toString).toArray(String[]::new);
    }
}
