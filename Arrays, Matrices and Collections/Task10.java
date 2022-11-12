//Write a Java program that completes an array A with n integers and forms two other arrays B and C, 
//where the first vector B will contain only even components from A, and the second array C only odd components.

import java.util.Arrays;
import java.util.Scanner;

public class other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of array: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        int count_odd = 0, count_even = 0;

        for(int i = 0; i < len; i++){
            System.out.print(String.format("Element %s: ", i));
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < len; i++){
            if(arr[i]%2 == 0) count_even++;
            if(arr[i]%2 != 0) count_odd++;
        }
        int[] B = new int[count_even];
        int[] C = new int[count_odd];
        int j = 0, k = 0;

        for(int i = 0; i < len; i++){
            if(arr[i]%2 == 0) B[j++] = arr[i];
            if(arr[i]%2 != 0) C[k++] = arr[i];
        }

        System.out.println("B = " + Arrays.toString(B));
        System.out.println("C = " + Arrays.toString(C));
    }
}
