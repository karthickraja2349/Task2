import java.util.Scanner;

class Problem26 {
    public static void main(String[] args) {
        new Problem26().initialize();
    }

    public void initialize() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to print the pattern:");
        int n = input.nextInt();
        printPattern(n);
    }

    private void printPattern(int n) {
        int totalRows = 2 * n - 1;

        for (int i = 0; i < totalRows; i++) {
            int numStars = Math.abs(n - i - 1);
            int numUnderlines = totalRows - 2 * numStars-1;
            for (int j = 0; j < numStars; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < numUnderlines; j++) {
                System.out.print('_');
            }
            for (int j = 0; j < numStars; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
