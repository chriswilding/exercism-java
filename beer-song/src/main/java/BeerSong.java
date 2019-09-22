public class BeerSong {
    private static BottleNumber getBottleNumber(int number) {
        switch (number) {
            case 0:
                return new BottleNumber0();
            case 1:
                return new BottleNumber1();
            default:
                return new BottleNumber(number);
        }
    }

    String sing(int verse, int number) {
        var sb = new StringBuilder();

        for (var i = 0; i < number; i++) {
            var bottleNumber = getBottleNumber(verse - i);
            var action = bottleNumber.getAction();
            var nextBottleNumber = bottleNumber.next();

            var bns = bottleNumber.toString();
            sb.append(bns.substring(0, 1).toUpperCase());
            sb.append(bns.substring(1));
            sb.append(" of beer on the wall, ");
            sb.append(bns);
            sb.append(" of beer.\n");
            sb.append(action);
            sb.append(", ");
            sb.append(nextBottleNumber.toString());
            sb.append(" of beer on the wall.\n\n");
        }

        return sb.toString();
    }

    String singSong() {
        return sing(99, 100);
    }
}
