//Create an array of n integer elements and print the array using all available loops (for, foreach, while, do…while).

import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        int array[] = {1, 5, -15, 8, 26};
        int i = 0;

        System.out.println("Printed by for: ");
        for(i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        i = 0;


        System.out.println("Printed by foreach: ");
        for (int num:array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Printed by while: ");
        while (i < array.length){
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
        i = 0;


        System.out.println("Printed by do...while: ");
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
    }
}
