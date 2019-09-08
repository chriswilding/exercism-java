class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
	    var numberOfDigits = Math.floor(Math.log10(numberToCheck)) + 1;

	    var total = 0;
	    for (var i = 0; i < numberOfDigits; i++) {
            var nthDigit = Double.valueOf(numberToCheck % Math.pow(10, i + 1)).intValue() / Double.valueOf(Math.pow(10, i)).intValue();
            total += Double.valueOf(Math.pow(nthDigit, numberOfDigits)).intValue();
        }

	    return numberToCheck == total;
	}

}
