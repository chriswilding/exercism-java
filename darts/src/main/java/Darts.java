class Darts {
    private final double x;
    private final double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        var radius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (radius <= 1) {
            return 10;
        } else if (radius <= 5) {
            return 5;
        } else if (radius <= 10) {
            return 1;
        }
        return 0;
    }

}
