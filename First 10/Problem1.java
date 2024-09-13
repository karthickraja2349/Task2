import java.util.Scanner; 
class Problem1{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = input.next().toUpperCase().charAt(0);
        new Problem1().printChar(ch);
    }
    
     private void printChar(char ch){
         for(char c=ch;c<='Z';c++){
             System.out.print(c+" ");
         }
     }
        
    
}