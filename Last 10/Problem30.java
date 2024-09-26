import java.util.ArrayList;
import java.util.List;

public class Problem30 {
    public static List<List<Integer>> getAntiDiagonals(int[][] matrix) {
        int N = matrix.length;
        List<List<Integer>> result = new ArrayList<>();        
        for (int start = 0; start < N; start++) {
            result.add(collectAntiDiagonal(matrix, 0, start));
        }

        for (int start = 1; start < N; start++) {
            result.add(collectAntiDiagonal(matrix, start, N - 1));
        }

        return result;
    }

    
    private static List<Integer> collectAntiDiagonal(int[][] matrix, int startRow, int startCol) {
        List<Integer> antiDiagonal = new ArrayList<>();
        int N = matrix.length;
        int row = startRow;
        int col = startCol;

        while (row < N && col >= 0) {
            antiDiagonal.add(matrix[row][col]);
            row++;
            col--;
        }

        return antiDiagonal;
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
