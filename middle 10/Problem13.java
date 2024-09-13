import java.util.Scanner;
class Problem13{
    private Scanner input = new Scanner(System.in);
    public static void main (String[]args){
        new Problem13().initialize();
    }
    
    public void initialize(){
        System.out.println("Enter the range of the array:");
        int range = input.nextInt();
        int array[] = array(range);
        printArray(array);
        int smallest= findSmallest(array);
        System.out.println("The smallest element is:"+smallest);
    }
    
    private int[] array(int range){
        int array[]=new int[range];
        System.out.println("Enter the array Elements:");
        for(int i=0;i<range;i++){
            array[i]=input.nextInt();
        }
        return array;
    }
    
    private void printArray(int array[]){
        System.out.println("The array is:");
        System.out.print("[");
        for(int i=0;i<array.length;i++){
            if(i!=0)
              System.out.print(","+array[i]);
            else 
              System.out.print(array[i]);
        }
        System.out.print("]");
        System.out.println();
    }
    
    private  int findSmallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
}