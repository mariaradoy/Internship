//Given two strings of lowercase English letters, a and b, perform the following operations:

//Sum the lengths of a and b. Print the result.
//Determine if a is lexicographically larger than b (i.e.: does a come before b in the dictionary?).
//Capitalize the first letter in a and b and print both strings on a single line, separated by a space.

import java.math.BigInteger;
import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Input first string: ");
       String a = scanner.nextLine();
       System.out.print("Input second string: ");
       String b = scanner.nextLine();

       System.out.println("The length of a and b is "+(a.length()+b.length()));
       System.out.println(a.compareTo(b));

       String a2 = a.substring(0,1).toUpperCase() + a.substring(1);
       String b2 = b.substring(0,1).toUpperCase() + b.substring(1);
       System.out.println(a2 + " " + b2);
    }
}
