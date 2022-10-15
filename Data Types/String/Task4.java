//Write a Java program to concatenate a given string to the end of another string.

import java.math.BigInteger;
import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Input first string: ");
       String str1 = scanner.nextLine();
       System.out.print("Input second string: ");
       String str2 = scanner.nextLine();

        String string3 = str1.concat(str2);
        System.out.println(string3);


    }
}
