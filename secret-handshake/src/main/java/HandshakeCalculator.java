import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    private static final int REVERSE = 16;

    List<Signal> calculateHandshake(int number) {
        List<Signal> actions = new ArrayList<>();

        for (var signal : Signal.values()) {
            if ((number & (1 << signal.ordinal())) > 0) {
                actions.add(signal);
            }
        }

        if ((number & REVERSE) > 1) {
            Collections.reverse(actions);
        }

        return actions;
    }

}
