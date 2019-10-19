import java.util.ArrayList;
import java.util.List;

class Series {
    private final String input;

    Series(String input) {
        this.input = input;
    }

    List<String> slices(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Slice size is too small.");
        }

        if (length > input.length()) {
            throw new IllegalArgumentException("Slice size is too big.");
        }

        var n = input.length() - length;
        var slices = new ArrayList<String>();

        for (var i = 0; i <= n; i++) {
            var substring = input.substring(i, i + length);
            slices.add(substring);
        }

        return slices;
    }
}
