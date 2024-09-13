import java.util.Scanner;
class Problem28{
    private Scanner input = new Scanner(System.in);
    public static void main (String[]args){
        new Problem28().initialize();
    }
    public void initialize(){
        System.out.println("Enter the range to sum:");
        int range = input.nextInt();
        int sum = findSum(range);
        System.out.println(sum);
    }
    private int findSum(int range){
        StringBuilder result = new StringBuilder(range);
        int array[] = new int[range];
        System.out.println("Enter the sum number (1 to 9):");
        int sumNumber = input.nextInt();
        return findSum(result,array,range,sumNumber);
    }
    private int findSum(StringBuilder result,int array[],int range,int sumNumber){
        result.append(sumNumber);
        for(int i=0;i<range;i++){
            String str=result.toString();
            array[i]=Integer.parseInt(str);
            result.append(sumNumber);
        }
        return findSum(array);
    }
    private int findSum(int[]array){
        int sum =0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    
   
}