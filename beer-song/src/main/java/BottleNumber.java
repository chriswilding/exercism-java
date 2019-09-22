class BottleNumber {
    private final int number;

    BottleNumber(int number) {
        this.number = number;
    }

    String getAction() {
        return "Take one down and pass it around";
    }

    String getContainer() {
        return "bottles";
    }

    String getQuantity() {
        return Integer.toString(number);
    }

    BottleNumber next() {
        if (number == 2) return new BottleNumber1();
        return new BottleNumber(number - 1);
    }

    public String toString() {
        return String.format("%s %s", getQuantity(), getContainer());
    }
}
