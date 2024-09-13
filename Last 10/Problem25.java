import java.util.Scanner;
class Problem25{
    public static void main (String[]args){
        new Problem25().initialize();
    }
    
    public void initialize(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range (in odd number):");
        int range = input.nextInt();
        if(range%2!=0)
           printX(range);
        else{
           System.out.println("You provided even range.please provide odd format range!");
           initialize();
        }
    }
    
    private void printX(int range) {
        int mid = range / 2 + 1;
        for (int i = 1;i <= range;i++) {
             for (int j = 1;j <= range;j++) {
                if (i == j) 
                   System.out.print(i);
                else if (i + j == range + 1) 
                   System.out.print(j);
                else 
                   System.out.print(" ");
             }
             System.out.println();
        }
    }
}