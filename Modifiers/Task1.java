//Write a Java method to compute the average of three numbers. 

import java.util.Scanner;

public class methods {
    static double average(int a, int b, int c){
        double average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input third number: ");
        int num3 = scanner.nextInt();
        
        average(num1, num2, num3);

    }
}
