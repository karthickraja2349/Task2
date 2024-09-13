class Problem22 {
    public static void main(String[] args) {
        int n = 9;
        hillPattern(n, n);
    }

    static void hillPattern(int number, int index) {
        if (number == 0) {
            return;
        }
        space(index - number); 
        asterik(number); 
        System.out.println();
        hillPattern(number - 1, index); 
    }

    static void space(int space) {
        if (space == 0) {
            return;
        }
        System.out.print(" ");
        space(space - 1);
    }

    static void asterik(int index) {
        if (index == 0) {
            return;
        }
        System.out.print("* ");
        asterik(index - 1);
    }
}
