//Write a recursive method in Java that reads a natural number N and calculates 2 to the power of N.

import java.util.Scanner;

public class exempl {

    static int power(int n){
        int base = 2;
        if(n != 0){
            return base*power(n-1);
        }
        else return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемую степень: ");
        int n = scanner.nextInt();

        System.out.println(power(n));
    }
}
