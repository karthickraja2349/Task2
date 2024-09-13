import java.util.Arrays;

public class Problem19 {

    
    public int[][] leftRotateMatrix(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] flatArray = flattenMatrix(matrix);
        rotateLeft(flatArray, k);
        return reconstructMatrix(flatArray, rows, cols);
    }

    
    private int[] flattenMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] flatArray = new int[rows * cols];
        int index = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                flatArray[index++] = value;
            }
        }
        return flatArray;
    }

    
    private void rotateLeft(int[] array, int k) {
        int n = array.length;
        k = k % n;
        reverse(array, 0, k - 1);
        reverse(array, k, n - 1);
        reverse(array, 0, n - 1);
    }

   
    private void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    
    private int[][] reconstructMatrix(int[] flatArray, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = flatArray[index++];
            }
        }
        return matrix;
    }

    
    private void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        Problem19 rotation = new Problem19();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int k = 4; 
        int[][] rotatedMatrix = rotation.leftRotateMatrix(matrix, k);

        System.out.println("Original Matrix:");
        rotation.printMatrix(matrix);

        System.out.println("Rotated Matrix:");
        rotation.printMatrix(rotatedMatrix);
    }
}
