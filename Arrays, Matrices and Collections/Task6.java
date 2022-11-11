//Write a Java program to remove the duplicate elements of a given array and return the new length of the array. 
//After removing the duplicate elements the program should return the new length of the array. 

import java.util.Arrays;

public class exempl {

    public static int removeDuplicates(int array[], int n){
        int[] temp = new int[n];
        Arrays.sort(array);

        int j = 0;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] != array[i + 1]){
                temp[j++] = array[i];
            }
        }

        temp[j++] = array[n - 1];

        for (int i = 0; i < j; i++){
            array[i] = temp[i];
        }

       return j;
    }

    public static void main(String[] args) {
        int array[] = {1, 1, 2, 3, 5, 6, 1, 2, 3};
        int n = array.length;
        n = removeDuplicates(array, n);

        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
