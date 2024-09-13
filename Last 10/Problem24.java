import java.util.Scanner;
class Problem24 {
    public static void main(String[] args) {
        new Problem24().initialize();
    }

    public void initialize() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows to print:");
        int range = input.nextInt();
        printHill(range);
    }

    private void printHill(int rows) {
        int number = 1; 
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++) 
                System.out.print(number++ + " ");
            System.out.println(); 
        }
    }
}
