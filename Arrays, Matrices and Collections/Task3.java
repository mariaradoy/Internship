//Write a Java program to remove a specific element from an array.

import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        int array[] = {125, 8, 12, 0, -4, 3, 20};
        int[] new_arr = new int[array.length - 1];

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        int j = 0;
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number to remove from array: ");
        int num = scanner.nextInt();

        for(int i = 0; i < array.length; i++){
            if(array[i] != num){
              new_arr[j++] = array[i];
            }
        }

        for(int i = 0; i < new_arr.length; i++){
            System.out.print(new_arr[i] + " ");
        }
    }
}
