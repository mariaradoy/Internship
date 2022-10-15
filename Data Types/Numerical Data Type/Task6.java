//Write a Java program that reads an integer from 4 digits X. 
//Display the number obtained from the sum of the numbers obtained by removing the first digit of X in turn, then the first two, then the first three.

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Input number: ");
       int number = scanner.nextInt();

            int n1 = number%1000;
            int n2 = number%100;
            int n3 = number%10;

       System.out.println(n1 + " + " + n2 + " + " + n3);
    }
}

