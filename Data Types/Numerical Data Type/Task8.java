//Write a Java program to compare two given signed and unsigned numbers.

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Input numbers: ");
       int number1 = scanner.nextInt();
       int number2 = scanner.nextInt();

       int signed = Integer.compare(number1, number2);
       int unsigned = Integer.compareUnsigned(number1, number2);

       System.out.println("Signed integers comparing result is " + signed);
       System.out.println("Unsigned integers comparing result is " + unsigned);

    }
}
