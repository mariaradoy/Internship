import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        arr = new int[10];
        int sum = 0;
        double ar_min = 0;
        int counter = 1;

        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                sum += arr[i];
            }
            if(arr[i] < 0){
                ar_min += arr[i];
                counter++;
            }
        }
        ar_min /= counter;
        System.out.println("Sum = " + sum);
        System.out.println("Arithmetic mean = " + ar_min);

    }
}
