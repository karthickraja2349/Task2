import java.util.Scanner;

class Problem11 {

    public static void main(String[] args) {
        new Problem11().initialize();
    }

    public void initialize() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String:");
        String value = input.nextLine();
        count(value);
    }

    private void count(String value) {
        int i = 0;
        while (i < value.length()) {
            char ch = value.charAt(i);
            i++;
            StringBuilder numberBuilder = new StringBuilder();
            while (i < value.length() && Character.isDigit(value.charAt(i))) {
                numberBuilder.append(value.charAt(i));
                i++;
            }
            if (numberBuilder.length() > 0) {
                int range = Integer.parseInt(numberBuilder.toString());
                print(ch, range);
            }
            else{
                print(ch,1);
            }
        }
    }

    private void print(char ch, int range) {
        for (int i = 0; i < range; i++) {
            System.out.print(ch);
        }
    }
}
