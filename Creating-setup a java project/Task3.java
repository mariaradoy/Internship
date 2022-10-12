//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int first_number = scanner.nextInt();

        System.out.println("Input second number: ");
        int second_number = scanner.nextInt();

        System.out.println(first_number + " + " + second_number + " = " + first_number+second_number);
        System.out.println(first_number + " - " + second_number + " = " + (first_number-second_number));
        System.out.println(first_number + " * " + second_number + " = " + first_number*second_number);
        System.out.println(first_number + " / " + second_number + " = " + first_number/second_number);
        System.out.println(first_number + " mod " + second_number + " = " + first_number%second_number);
    }
}
