//One person deposited R lei on his account. At the end of each month the amount increases by W percent. How much money will be on the account in 3, 4, 5 months?

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Input deposit number: ");
       int deposit = scanner.nextInt();
       System.out.println("Input percent number: ");
       float percent = scanner.nextInt();
       System.out.println("Input amount of months: ");
       int months = scanner.nextInt();

       float total = deposit*(1 + (percent/100)*months);
       System.out.println("The total amount of money in " + months + " months is " + total);

    }
}
