import java.util.Scanner;

class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char inputChar = scanner.next().charAt(0); // Read the first character of the input
        if (Character.isLetter(inputChar)) {
            System.out.println(inputChar + " is an alphabet.");
        }
        else {
            System.out.println(inputChar + " is not an alphabet.");
        }
        scanner.close();
    }
}
