// Write a Java program that completes a vector A with n integers read from the keyboard and calculates the product of odd values on the even positions 
//and the sum of even values on the odd positions.

import java.util.Scanner;
import java.util.Vector;

public class exempl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of vector: ");
        int n = scanner.nextInt();
        Vector v = new Vector(n);
        int prod = 1;
        int sum = 0;

        for(int i = 0; i < n; i++){
            System.out.print(String.format("Element %s: ", i));
            v.addElement(scanner.nextInt());
        }

        for(int i = 0; i < n; i++){
            int j = (int) v.get(i);
            if(i%2 == 0 && j%2 != 0)prod *= j;
            if(i%2 != 0 && j%2 == 0) sum += j;
        }
        System.out.print(String.format("Sum = %s. Prod = %s", sum, prod));
    }
}
