//Write a Java program to compare two numbers. 

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int first_number = scanner.nextInt();
        System.out.println("Input second number: ");
        int second_number = scanner.nextInt();

        if(first_number == second_number) {
            System.out.println(first_number + " == " + second_number);
        }
        if(first_number != second_number) {
            System.out.println(first_number + " != " + second_number);
        }
        if(first_number < second_number){
            System.out.println(first_number + " < " + second_number);
        }
        if(first_number <= second_number){
            System.out.println(first_number + " <= " + second_number);
        }
        if(first_number > second_number){
            System.out.println(first_number + " > " + second_number);
        }
        if(first_number >= second_number){
            System.out.println(first_number + " >= " + second_number);
        }
    }
}
