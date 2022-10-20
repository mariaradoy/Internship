//Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int input = scanner.nextInt();
        if(input > 0){
            System.out.println("Number is positive");
        }
        else if(input < 0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is 0");
        }
    }
}
