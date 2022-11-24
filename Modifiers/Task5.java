//Write a Java method to check whether a string is a valid password.

import java.util.Scanner;

public class methods {

    static boolean validPassword(String password) {
        int charCount = 0;
        int intCount = 0;
        if (password.length() >= 10) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (is_digit(ch)) intCount++;
                else if (is_letter(ch)) charCount++;
                else return false;
            }
        }
        return (charCount >= 2 && intCount >= 2);
    }

    static boolean is_letter(char ch){
        ch = Character.toLowerCase(ch);
        return (ch >= 'a' && ch <= 'z');
    }

    static boolean is_digit(char ch){
        return (ch >= '0' && ch <= '9');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                        "2. A password consists of only letters and digits.\n" +
                        "3. A password must contain at least two digits \n");
        System.out.print("Input a password: ");
        String password = scanner.nextLine();
        if(validPassword(password) == true) System.out.println("Password is valid");
                else System.out.print("Password is not valid");
    }
}
