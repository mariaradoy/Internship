//Write a program that would meet the following conditions:

//    Check if the number nr divisible by n;
//    Specify all numbers in the range [a; b], divisible by n;
//    Specify the first n numbers, divisible by n;

import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        System.out.print("Input nr: ");
        int nr = scanner.nextInt();
        System.out.print("Input a: ");
        int a = scanner.nextInt();
        System.out.print("Input b: ");
        int b = scanner.nextInt();

        int count = 0;

        System.out.println();

        if(nr%n == 0){
            System.out.println("nr is divisible by n");
        }else {
            System.out.println("nr is not divisible by n");
        }

        System.out.println();
// Я объединила 2 и 3 пункт, потому что не поняла какой интервал имеется ввиду в 3 пункте
        for(int i = a; i <= b; i++){
            if(i%n == 0){
                if(count < n){
                    System.out.println(i + " is divisible by n");
                    count++;
                }
            }
        }
        
    }
}
