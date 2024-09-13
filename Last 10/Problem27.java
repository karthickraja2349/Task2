import java.util.Scanner;
class Problem27 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter first string:");
       String string1=input.nextLine();
       System.out.println("Enter Second string:");
       String string2=input.nextLine();
       System.out.println(new Problem27().findSubstringIndex(string1, string2));  
    }
    public  int findSubstringIndex(String string1, String string2) {
        if (string1 == null || string2 == null) {
            throw new IllegalArgumentException("Input strings must not be null.");
        }
        return string1.indexOf(string2);
    }
}
