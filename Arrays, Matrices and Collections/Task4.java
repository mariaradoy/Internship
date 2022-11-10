//Write a Java program to insert an element (specific position) into an array.

import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        int array[] = {125, 8, 12, 0, -4, 3, 20};
        int[] new_arr = new int[array.length + 1];

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int j = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number to add in array: ");
        int num = scanner.nextInt();
        System.out.print("Input the index to insert this number: ");
        int index = scanner.nextInt();

        if(index < new_arr.length){
            for (int i = 0; i < new_arr.length; i++) {
                if (i == index) continue;
                new_arr[i] = array[j++];
            }
            new_arr[index] = num;
        } else {
            System.out.println("Index is out of range ");
        }

        for(int i = 0; i < new_arr.length; i++){
            System.out.print(new_arr[i] + " ");
        }
    }
}
