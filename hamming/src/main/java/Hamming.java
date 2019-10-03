class Hamming {
    private final String leftStrand;
    private final String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            if (leftStrand.isEmpty()) {
                throw new IllegalArgumentException("left strand must not be empty.");
            }
            if (rightStrand.isEmpty()) {
                throw new IllegalArgumentException("right strand must not be empty.");
            }
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        var hammingDistance = 0;

        for (var i = 0; i < leftStrand.length(); i++) {
            var leftNucleotide = leftStrand.charAt(i);
            var rightNucleotide = rightStrand.charAt(i);

            if (leftNucleotide != rightNucleotide) {
                hammingDistance += 1;
            }
        }

        return hammingDistance;
    }

}
