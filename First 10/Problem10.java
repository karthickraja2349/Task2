import java.util.Scanner;

class Problem10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        reverseWords(words, 0, words.length - 1);
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
        scanner.close();
    }
    
    private static void reverseWords(String[] words, int start, int end) {
        if (start >= end) {
            return;
        }
        String temp = words[start];
        words[start] = words[end];
        words[end] = temp;
        reverseWords(words, start + 1, end - 1);
    }
}
