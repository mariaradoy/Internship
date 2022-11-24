//Write a Java method with a single parameter k - a natural number of at least 3 digits and at most 7 digits, 
//with all non-zero digits, displays the value obtained by removing the first and last digit of the number transmitted in the call.

import java.util.Scanner;

public class methods {
    static String remove(int n) {
        String num = null;
        if (String.valueOf(n).length() >= 3 || String.valueOf(n).length() <= 7) {
            num = Integer.toString(n);
            for (int i = 1; i < num.length() - 1; i++) {
                System.out.print(num.charAt(i));
            }
        } else {
            System.out.print("Input another number");
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        remove(num);
    }
}
