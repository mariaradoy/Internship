//Write a Java program to get a substring of a given string between two specified positions.

import java.math.BigInteger;
import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
       String str = "It's hard to find a favorite job";
       Scanner scanner = new Scanner(System.in);
       System.out.print("Input indexes for finding a substring: ");
       int index1 = scanner.nextInt();
       int index2 = scanner.nextInt();
       System.out.println(str.substring(index1,index2));

    }
}
