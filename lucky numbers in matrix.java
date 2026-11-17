import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minCol = 0;
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] < matrix[i][minCol]) minCol = j;
            }
            int value = matrix[i][minCol];
            boolean largest = true;
            for (int r = 0; r < matrix.length; r++) {
                if (matrix[r][minCol] > value) largest = false;
            }
            if (largest) result.add(value);
        }
        return result;
    }
}
