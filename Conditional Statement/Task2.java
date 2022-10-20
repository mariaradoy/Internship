//Take three numbers from the user and print the greatest number.

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
        System.out.println();

        if(input1 > input2){
            if(input1>input3){
                System.out.println(input1);
            }
        }

        if(input2 > input1){
            if(input2>input3){
                System.out.println(input2);
            }
        }

        if(input3 > input1){
            if(input3 > input2){
                System.out.println(input3);
            }
        }
    }
}
