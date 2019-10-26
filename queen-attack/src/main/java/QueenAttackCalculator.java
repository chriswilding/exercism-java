class QueenAttackCalculator {
    private final Queen black;
    private final Queen white;

    QueenAttackCalculator(Queen black, Queen white) {
        if (black == null || white == null) {
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        }
        if (black.getRow() == white.getRow() && black.getColumn() == white.getColumn()) {
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        }

        this.black = black;
        this.white = white;
    }

    boolean canQueensAttackOneAnother() {
        if (black.getRow() == white.getRow() || black.getColumn() == white.getColumn()) {
            return true;
        }
        return Math.abs(black.getRow() - white.getRow()) == Math.abs(black.getColumn() - white.getColumn());
    }
}
