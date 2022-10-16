//Write a Java program to print after removing duplicates from a given string.

import java.util.Arrays;
import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Input string: ");
       String str = scanner.nextLine();
       char[] string = str.toCharArray();

       int index = 0; 
       for(int i = 0; i < str.length(); i++){
           int j;
           for(j = 0; j < i; j++){
               if(string[i] == string[j]){
                   break;
               }
           }
           if(j == i){
               string[index++] = string[i];
           }
       }
    System.out.println(String.valueOf(Arrays.copyOf(string,index)));
    }
}
