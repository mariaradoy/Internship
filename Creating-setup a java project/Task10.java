//Write a program that reads a number of years and calculates the corresponding number of months, days and hours. It is considered that a year has 365 days.

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input years amount: ");
        int years = scanner.nextInt();

        int months = years * 12;
        int days = years * 365;
        int hours = years * 8760;

        System.out.println(months + " months, " + days + " days, " + hours + " hours");
        
    }
}
