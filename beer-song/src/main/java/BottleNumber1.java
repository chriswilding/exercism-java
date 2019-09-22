class BottleNumber1 extends BottleNumber {
    BottleNumber1() {
        super(1);
    }

    String getAction() {
        return "Take it down and pass it around";
    }

    String getContainer() {
        return "bottle";
    }

    BottleNumber next() {
        return new BottleNumber0();
    }
}
