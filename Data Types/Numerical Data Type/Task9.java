//Write a Java program to get the next floating-point adjacent in the direction of positive and negative infinity from a given float/double number.

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.print("Initial float number: ");
       float fnum = scanner.nextFloat();
       System.out.print("Initial double number: ");
       double dnum = scanner.nextDouble();

       System.out.println("Float" + fnum + "next down is " + Math.nextDown(fnum));
       System.out.println("Float" + fnum + "next up is " + Math.nextUp(fnum));
       System.out.println();
       System.out.println("Double" + dnum + "next down is " + Math.nextDown(dnum));
       System.out.println("Double" + dnum + "next up is " + Math.nextUp(dnum));




    }
}
