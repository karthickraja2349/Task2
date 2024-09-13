import java.util.ArrayList;
import java.util.List;

public class Problem30 {
    public static List<List<Integer>> getAntiDiagonals(int[][] matrix) {
        int N = matrix.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int startCol = 0; startCol < N; startCol++) {
            List<Integer> antiDiagonal = new ArrayList<>();
            int row = 0;
            int col = startCol;
            while (row < N && col >= 0) {
                antiDiagonal.add(matrix[row][col]);
                row++;
                col--;
            }
            result.add(antiDiagonal);
        }

        // Collect anti-diagonals starting from the left column (excluding the top-left cell)
        for (int startRow = 1; startRow < N; startRow++) {
            List<Integer> antiDiagonal = new ArrayList<>();
            int row = startRow;
            int col = N - 1;
            while (row < N && col >= 0) {
                antiDiagonal.add(matrix[row][col]);
                row++;
                col--;
            }
            result.add(antiDiagonal);
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2},
            {3, 4}
        };

        System.out.println("Anti-diagonals for matrix1:");
        printAntiDiagonals(getAntiDiagonals(matrix1));

        System.out.println("Anti-diagonals for matrix2:");
        printAntiDiagonals(getAntiDiagonals(matrix2));
    }

    private static void printAntiDiagonals(List<List<Integer>> antiDiagonals) {
        for (List<Integer> diagonal : antiDiagonals) {
            System.out.println(diagonal);
        }
    }
}
