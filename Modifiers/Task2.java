//Write a Java method to count all vowels in a string. 

import java.util.Locale;
import java.util.Scanner;

public class methods {
    public static int count_Vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = scanner.nextLine();
        System.out.print("Vowels in string: " + count_Vowels(str.toLowerCase()));
        
    }
}
