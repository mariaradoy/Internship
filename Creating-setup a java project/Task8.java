//Ion and Vasile play the following game: Ion says a number, 
//and Vasile must find five consecutive, ascending numbers, the number in 
//the middle being the one chosen by Ion. Help Vasile find the answer faster.

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vasile says ");
        int mid_number = scanner.nextInt();
        int fnum = mid_number-2;
        int snum = mid_number-1;
        int tnum = mid_number+1;
        int fosum = mid_number+2;

        System.out.print("Vasile says ");
        System.out.print(fnum + " ");
        System.out.print(snum + " ");
        System.out.print(mid_number+ " ");
        System.out.print(tnum + " ");
        System.out.print(fosum);
    }
}
