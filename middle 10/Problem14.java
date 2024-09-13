import java.util.Scanner;

class Problem14 {
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new Problem14().initialize();
    }
    
    public void initialize() {
        System.out.println("Enter the range of the array:");
        int range = input.nextInt();
        int[] sourceArray = initializeArray(range);
        int[] destinationArray = copyArray(sourceArray);
        System.out.println("Source array:");
        printArray(sourceArray);
        System.out.println("Destination array:");
        printArray(destinationArray);
        input.close();
    }
    
    private int[] initializeArray(int range) {
        int[] array = new int[range];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < range; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }
    
    private int[] copyArray(int[] sourceArray) {
        int[] destinationArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
        return destinationArray;
    }
    
    private void printArray(int[] array) {
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
}
