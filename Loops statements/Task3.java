import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int input1 = scanner.nextInt();
        System.out.println("Input second number: ");
        int input2 = scanner.nextInt();
        int last_digit;

        for(int i = input1; i <= input2; i++){
            last_digit = i%10;
            if(last_digit%3==0 && last_digit != 0){
                System.out.print(i + ", ");
            }
        }

    }
}
