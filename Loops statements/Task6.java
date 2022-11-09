// Write a program that checks if a number is "perfect," that is, equal to the sum of its divisors, including 1. Perfect number is: 6, 28, 496…

import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int input = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i < input; i++){
            if(input%i == 0){
                sum += i;
            }
        }

        if(sum == input) {
            System.out.println(input + " is a perfect number.");
        }
        else {
            System.out.println(input + " is not a perfect number.");
        }
    }
}
