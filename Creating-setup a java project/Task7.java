//Write a Java program to convert a binary number to decimal number. 

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input binary number: ");
        int binary_number = scanner.nextInt();
        int integer_number = 0, i = 0;
        long remainder;

        while (binary_number != 0) {
            remainder = binary_number % 10;
            binary_number /= 10;
            integer_number += remainder * Math.pow(2, i);
            ++i;
        }
        System.out.println(integer_number);
        
    }
}
