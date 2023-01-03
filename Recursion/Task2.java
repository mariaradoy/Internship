//Write a recursive method in Java that reads two numbers N and X and determines the number of occurrences of the digit X in the natural number N.

import java.util.Scanner;

public class exempl {

    static int occur(int n, int m){

        if(n == 0){
            return 0;
        }
        else {
            int digit = n % 10;
                    if (digit == m) return 1 + occur(n / 10, m);
            return occur(n / 10, m);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int first = scanner.nextInt();
        System.out.println("Input second number: ");
        int second = scanner.nextInt();

        System.out.println(occur(first, second));


    }
}
