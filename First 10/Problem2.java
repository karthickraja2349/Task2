public class Problem2 {
    public static void main(String[] args) {
        int a = 12; 
        int b = 7;  
        
        System.out.println("Input values: a = " + a + " (binary: " + Integer.toBinaryString(a) + "), b = " + b + " (binary: " + Integer.toBinaryString(b) + ")");
        
        // Bitwise AND
        int andResult = a & b;
        System.out.println("Bitwise AND (a & b): " + andResult + " (binary: " + Integer.toBinaryString(andResult) + ")");
        
        // Bitwise OR
        int orResult = a | b;
        System.out.println("Bitwise OR (a | b): " + orResult + " (binary: " + Integer.toBinaryString(orResult) + ")");
        
        // Bitwise XOR
        int xorResult = a ^ b;
        System.out.println("Bitwise XOR (a ^ b): " + xorResult + " (binary: " + Integer.toBinaryString(xorResult) + ")");
        
        // Bitwise NOT
        int notResultA = ~a;
        int notResultB = ~b;
        System.out.println("Bitwise NOT (~a): " + notResultA + " (binary: " + Integer.toBinaryString(notResultA) + ")");
        System.out.println("Bitwise NOT (~b): " + notResultB + " (binary: " + Integer.toBinaryString(notResultB) + ")");
        
        // Bitwise Left Shift
        int shiftLeftA = a << 2;
        System.out.println("Bitwise Left Shift (a << 2): " + shiftLeftA + " (binary: " + Integer.toBinaryString(shiftLeftA) + ")");
        
        // Bitwise Right Shift
        int shiftRightA = a >> 2;
        System.out.println("Bitwise Right Shift (a >> 2): " + shiftRightA + " (binary: " + Integer.toBinaryString(shiftRightA) + ")");
    }
}
