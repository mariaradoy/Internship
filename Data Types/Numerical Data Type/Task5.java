//Write a Java program to break an integer into a sequence of individual digits.

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Input number: ");
       int number = scanner.nextInt();

       int n1 = number/100000%10;
       int n2 = number/10000%10;
       int n3 = number/1000%10;
       int n4 = number/100%10;
       int n5 = number/10%10;
       int n6 = number%10;

       System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
    }
}
