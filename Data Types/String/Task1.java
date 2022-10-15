//Write a Java program to get the character at the given index within the String.

import java.math.BigInteger;
import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
       String str = "Something to write in a string";
       Scanner scanner = new Scanner(System.in);
       System.out.print("Input the index: ");
       int index = scanner.nextInt();


       if(index < str.length()){
          System.out.println("The character at position " + index + " is " + str.charAt(index));
       }

    }
}
