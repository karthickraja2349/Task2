import java.util.Scanner;

class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char character = scanner.next().charAt(0); // Read the first character of input
        int asciiValue = (int) character;
        System.out.println("The ASCII value of '" + character + "' is " + asciiValue);
        scanner.close();
    }
}
