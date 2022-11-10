//Write a Java program to find the maximum and minimum value and index of an array.

import java.lang.reflect.Array;
import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        int array[] = {125, 8, 12, 0, -4, 3, 20};
        int max = array[0];
        int min = array[0];
        int max_pos = 0, min_pos = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > max) max = array[i];
            if(array[i] < min) min = array[i];
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] == max) max_pos = i;
            if(array[i] == min) min_pos = i;
        }

        System.out.println(String.format("max = %s, max_pos = %s, min = %s, min_pos = %s", max, max_pos, min, min_pos));
    }
}
