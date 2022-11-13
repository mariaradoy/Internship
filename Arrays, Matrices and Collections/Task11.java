import java.util.Arrays;
import java.util.Scanner;

public class other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the row and column number: ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int [][] new_arr = new int[n+1][n];
        int sum = 0;
        int[] temp = new int[n];
        int k = 0;

        //Ввод элементов
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(String.format("Element %s.%s: ", i, j));
                arr[i][j] = scanner.nextInt();
            }
        }

        //Вычисление сумм стобцов и запись в новый массив
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sum += arr[j][i];
            }
            temp[k++] = sum;
            sum = 0;
        }

        //Копирование элементов из массива в массив
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                new_arr[i][j] = arr[i][j];
            }
        }
        //
        for(int i = n; i <= n; i++){
            for(int j = 0; j < n; j ++){
                new_arr[i][j] = temp[j];
            }
        }
        //Вывод на экран
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < n; j++){
                System.out.println(String.format("Element %s.%s: %s", i, j, new_arr[i][j]));
            }
        }

    }
}
