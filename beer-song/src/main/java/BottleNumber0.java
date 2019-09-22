class BottleNumber0 extends BottleNumber {
    BottleNumber0() {
        super(0);
    }

    String getAction() {
        return "Go to the store and buy some more";
    }

    String getQuantity() {
        return "no more";
    }

    BottleNumber next() {
        return new BottleNumber(99);
    }
}
