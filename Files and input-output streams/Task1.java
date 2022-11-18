//Write Java program to read input from java console.

import java.util.Scanner;

public class other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.print("Input your last name: ");
        String last_name = scanner.nextLine();

        System.out.println("Your name is: " + name);
        System.out.println("Your last name is: " + last_name);


    }
}
