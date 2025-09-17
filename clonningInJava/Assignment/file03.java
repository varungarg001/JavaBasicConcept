package clonningInJava.Assignment;

import java.util.Scanner;

// In this program user enters a number and output will be binary representation of it.

public class file03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer i = scanner.nextInt();

        String output = String.format("%0" + 8 + "d", Integer.parseInt(Integer.toBinaryString(i)));
        System.out.println(output);
        scanner.close();
    }
}