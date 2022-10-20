//Given an integer n, perform the following conditional actions:
//
//    If n is odd, print “Weird”
//    If n is even and in the inclusive range of 2 to 5, print “Not Weird”
//    If n is even and in the inclusive range of 6 to 20, print “Weird”
//    If n is even and greater than 20, print “Not Weird”

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int input = scanner.nextInt();

        if(input%2 != 0){
            System.out.println("Weird");
        }
        if(input%2==0){
            if(input>=2 && input<= 5){
                System.out.println("Not Weird");
            }

            if(input>=6 && input<= 20){
                System.out.println("Weird");
            }

            if(input>=20){
                System.out.println("Not Weird");
            }
        }
    }
}
