import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int input = scanner.nextInt();

        for(int i = 1; i <= input; i++){
            System.out.println(i + ": " + i*i*i);
        }
    }
}
