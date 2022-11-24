//Every year that is exactly divisible by four is a leap year, except for years that are exactly divisible by 100, 
// but these centurial years are leap years if they are exactly divisible by 400. For example, the years 1700, 1800, 
// and 1900 are not leap years, but the years 1600 and 2000 are.
//Write a function boolean isLeapYear(int year) which returns true if a given year is leap, otherwise - false.

import java.util.Scanner;

public class methods {

    static boolean leapYear(int year){
        if(year%4 == 0 && year%100 == 0 && year%400 == 0) return true;
        else return  false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = scanner.nextInt();
        System.out.print(leapYear(year));
    }
}
