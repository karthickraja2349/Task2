import java.util.Scanner;

class Problem16 {
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new Problem16().initialize();
    }

    public void initialize() {
        System.out.println("Enter the range of the First array:");
        int range1 = input.nextInt();
        int[] array1 = array(range1);
        System.out.println("First array is:");
        printArray(array1);

        System.out.println("Enter the range for the second array:");
        int range2 = input.nextInt();
        int[] array2 = array(range2);
        System.out.println("Second array is:");
        printArray(array2);

        int[] union = union(array1, array2);
        System.out.println("The union array is:");
        printArray(union);
    }

    private int[] array(int range) {
        int[] array = new int[range];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < range; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    private void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }

    private int[] union(int[] array1, int[] array2) {
       
        int[] tempUnion = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            tempUnion[index++] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (tempUnion[j] == array2[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempUnion[index++] = array2[i];
            }
        }
        int[] unionArray = new int[index];
        for (int i = 0; i < index; i++) {
            unionArray[i] = tempUnion[i];
        }
        return unionArray;
    }
}
