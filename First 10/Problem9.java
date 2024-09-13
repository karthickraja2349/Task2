import java.util.Scanner;

class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        int originalNumber = number; 
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit; 
            number /= 10; 
        }
        System.out.println("The number in reverse order is: " + reversedNumber);
        scanner.close();
    }
}
