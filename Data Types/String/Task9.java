//Write a Java program to read a string and return the string without the first two characters. Keep the first character if it is 'g' and keep the second character if it is 'h'.

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first string: ");
        String input = scanner.nextLine();
        String temp = " ";

        for(int i = 0; i < input.length(); i++){
            if(i == 0 && input.charAt(i) == 'g'){
                temp += "g";
            } else if (i == 1 && input.charAt(i) == 'h') {
                temp += "h";
            }
            else if(i >= 2){
                temp += input.charAt(i);
            }
        }
        System.out.println("New string: " + temp);

    }
}
