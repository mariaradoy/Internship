//Write a Java program to convert minutes into a number of years and days.

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Input the number of minutes: ");
       int minutes = scanner.nextInt();

       int years = minutes/(60*24*365);
       int days = (minutes/60/24)%365;
       System.out.println(minutes + " minutes approximately is " + years + " years and " + days + " days");

    }
}
