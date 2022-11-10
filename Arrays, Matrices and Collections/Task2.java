//Write a Java program to find the index of an array element.

import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        int array[] = {125, 8, 12, 0, -4, 3, 20};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the index: ");
        int index = scanner.nextInt();

        if(index < array.length){
            for (int i = 0; i < array.length; i++) {
                if(index == i){
                    System.out.println(array[i]);
                }
            }
        }
        else System.out.println("Index is out of range");

    }
}
