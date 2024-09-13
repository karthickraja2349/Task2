import java.util.Scanner;

class Problem3 {
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Problem3 problem = new Problem3();
        System.out.println("Enter the total number of students:");
        int total = problem.input.nextInt();
        problem.makeGroups(total);
    }

    private void makeGroups(int total) {
        if (total != 20) {
            System.out.println("This program is designed for exactly 20 students.");
            return;
        }

        System.out.println("Enter starting roll number:");
        int start = input.nextInt();
        System.out.println("Enter ending roll number:");
        int end = input.nextInt();

        if (end - start + 1 != total) {
            System.out.println("Count mismatch. Please provide correct details!");
            return;
        }

        int numberOfGroups = 4;
        int studentsPerGroup = total / numberOfGroups;

        for (int group = 0; group < numberOfGroups; group++) {
            System.out.println("Group " + (group + 1) + ":");
            for (int i = 0; i < studentsPerGroup; i++) {
                System.out.println(start + group + i * numberOfGroups);
            }
        }
    }
}
