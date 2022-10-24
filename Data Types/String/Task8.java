//Write a Java program to reverse words in a given string.

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first string: ");
        String input = scanner.nextLine();

        String[] strings = input.split(" ");

        for (int i = strings.length - 1; i >= 0; i--){
            System.out.print(strings[i] + " ");
        }

    }
}
