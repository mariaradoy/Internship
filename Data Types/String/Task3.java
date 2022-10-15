//Write a Java program to compare two strings lexicographically. 
//Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.

import java.math.BigInteger;
import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Input first string: ");
       String str1 = scanner.nextLine();
       System.out.print("Input second string: ");
       String str2 = scanner.nextLine();

       if(str1.equals(str2)){
           System.out.println("Strings are equal");
       }
       else{
           System.out.println("Strings aren't equal");
       }


    }
}
