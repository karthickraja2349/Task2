import java.util.Scanner;

class Problem18 {
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new Problem18().initialize();
    }

    public void initialize() {
        System.out.println("Enter the range of the array:");
        int range = input.nextInt();
        int[] array = array(range);

        // Sort the array and print it
        sortArray(array);
        printArray(array);
    }

    private int[] array(int range) {
        int[] array = new int[range];
        System.out.println("Enter the array Elements:");
        for (int i = 0; i < range; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    private void printArray(int[] array) {
        System.out.println("The array is:");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print("," + array[i]);
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

    private void sortArray(int[] array) {
        // Extract elements at odd and even positions
        int[] oddElements = new int[(array.length + 1) / 2]; // Size for elements at even indices
        int[] evenElements = new int[array.length / 2];     // Size for elements at odd indices

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                oddElements[oddIndex++] = array[i];
            } else {
                evenElements[evenIndex++] = array[i];
            }
        }

        // Sort odd elements in descending order
        for (int i = 0; i < oddElements.length - 1; i++) {
            for (int j = i + 1; j < oddElements.length; j++) {
                if (oddElements[i] < oddElements[j]) {
                    int temp = oddElements[i];
                    oddElements[i] = oddElements[j];
                    oddElements[j] = temp;
                }
            }
        }

        // Sort even elements in ascending order
        for (int i = 0; i < evenElements.length - 1; i++) {
            for (int j = i + 1; j < evenElements.length; j++) {
                if (evenElements[i] > evenElements[j]) {
                    int temp = evenElements[i];
                    evenElements[i] = evenElements[j];
                    evenElements[j] = temp;
                }
            }
        }

        // Merge sorted elements back into the original array
        oddIndex = 0;
        evenIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = oddElements[oddIndex++];
            } else {
                array[i] = evenElements[evenIndex++];
            }
        }
    }
}
