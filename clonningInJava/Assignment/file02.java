package clonningInJava.Assignment;

import java.util.Scanner;
//  this program is use to provide the octal hexadecimal representation of a integer value
public class file02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer value: ");

        Integer i = scanner.nextInt();
        

        System.out.println("Binary representation: "+Integer.toBinaryString(i));
        System.out.println("Octal representation: "+Integer.toOctalString(i));
        System.out.println("HexaDecimal representation: " + Integer.toHexString(i));
        scanner.close();

        
    }
}