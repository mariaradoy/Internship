//Write a program that calculates the amount: S=1+1*2+1*2*3+…+1*2* …*n.

import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int input = scanner.nextInt();
        int prod = 1;
        int sum = 0;


        for(int i = 1; i <= input; i ++){
            for (int j = 1; j <= i; j++){
                prod *= j;
            }
            sum += prod;
            prod = 1;
        }
        System.out.println(sum);
}
}
