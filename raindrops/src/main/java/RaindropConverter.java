class RaindropConverter {

    String convert(int number) {
        var stringBuilder = new StringBuilder();

        if (number % 3 == 0) {
            stringBuilder.append("Pling");
        }

        if (number % 5 == 0) {
            stringBuilder.append("Plang");
        }

        if (number % 7 == 0) {
            stringBuilder.append("Plong");
        }

        var plingPlangPlong = stringBuilder.toString();
        if (plingPlangPlong.isBlank()) {
            return Integer.toString(number);
        } else {
            return plingPlangPlong;
        }
    }

}
