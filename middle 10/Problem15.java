import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Problem15 {
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new Problem15().initialize();
    }

    public void initialize() {
        System.out.println("Enter the range of the array:");
        int range = input.nextInt();
        int array[] = createArray(range);
        printArray(array);
        List<Integer> duplicates = findDuplicates(array);
        
       
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.print("Duplicates: " + duplicates);
        }
    }

    private int[] createArray(int range) {
        int array[] = new int[range];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < range; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    private void printArray(int array[]) {
        System.out.println("The array is:");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0)
                System.out.print("," + array[i]);
            else
                System.out.print(array[i]);
        }
        System.out.print("]");
        System.out.println();
    }

    private List<Integer> findDuplicates(int array[]) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !duplicates.contains(array[i])) {
                    duplicates.add(array[i]);
                }
            }
        }
        return duplicates;
    }
}
