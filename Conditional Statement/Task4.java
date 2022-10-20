//Write a program that reads from the keyboard three numeric values n1, n2, n3 and then displays on the screen the biggest difference between any two given values.

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int input1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int input2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int input3 = scanner.nextInt();
        int max_val = 0;
        int min_val = 0;

        if(input1 > input2){
            if(input1 > input3){
                max_val = input1;
                if(input2 > input3){
                    min_val = input3;
                }
                else {
                    min_val = input2;
                }
            }
        }

        if(input3 > input1){
            if(input3 > input2){
                max_val = input3;
                if(input1 > input2){
                    min_val = input2;
                }
                else {
                    min_val = input1;
                }
            }
        }

        if(input2 > input1){
            if(input2 > input3){
                max_val = input2;
                if(input1 > input3){
                    min_val = input3;
                }
                else {
                    min_val = input1;
                }
            }
        }



        System.out.println(max_val-min_val);
    }
}
