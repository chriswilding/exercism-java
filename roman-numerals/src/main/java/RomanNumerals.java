import java.util.TreeMap;

class RomanNumeral {

    private static final TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    private final String romanNumeral;

    RomanNumeral(int n) {
        var sb = new StringBuilder();

        while (n > 0) {
            var key = map.floorKey(n);
            var val = map.get(key);
            n -= key;
            sb.append(val);
        }

        romanNumeral = sb.toString();
    }

    public String getRomanNumeral() {
        return romanNumeral;
    }

}
