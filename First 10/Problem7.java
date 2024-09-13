import java.util.Scanner;
class Problem7{
    public static void main (String[]args){
        new Problem7().analyse();
    }
    
    public void analyse(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  value:");
        int a = input.nextInt();
        System.out.println(a+=a++ + ++a + --a + a--);
    }
} 