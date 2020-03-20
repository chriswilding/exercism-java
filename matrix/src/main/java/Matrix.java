import java.util.Arrays;
import java.util.regex.Pattern;

class Matrix {

    private static final Pattern COL_SPLIT = Pattern.compile(" ");

    private final int[][] matrix;

    Matrix(String matrixAsString) {
        matrix = matrixAsString
            .lines()
            .map(COL_SPLIT::split)
            .map(row -> Arrays.stream(row).mapToInt(Integer::parseInt).toArray())
            .toArray(int[][]::new);
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        var zeroIndexColumn = columnNumber - 1;
        int[] column = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            column[i] = matrix[i][zeroIndexColumn];
        }
        return column;
    }
}
