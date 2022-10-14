//Write a Java program which takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), 
//and display the speed, in meters per second, kilometers per hour and miles per hour.

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {

       float timeSeconds;
       float mps, kph, mph;

       Scanner scanner = new Scanner(System.in);
       System.out.println("Input distance in meters: ");
       int meters = scanner.nextInt();
       System.out.println("Input hours: ");
       int hours = scanner.nextInt();
       System.out.println("Input minutes: ");
       int minutes = scanner.nextInt();
       System.out.println("Input seconds: ");
       int seconds = scanner.nextInt();

       timeSeconds = hours*3600+minutes*60+seconds;

       mps = meters/timeSeconds;
       kph = (meters/1000.0f)/(timeSeconds/3600.0f);
       mph = (meters/1609.0f)/(timeSeconds/3600.0f);

       System.out.println("Your speed in meters/seconds is " + mps);
       System.out.println("Your speed in kilometers/hour is " + kph);
       System.out.println("Your speed in miles/hour is " + mph);
    }
}
