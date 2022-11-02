import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a 3 digits number: ");
        int num = scanner.nextInt();
        int n1, n2, n3;
        System.out.println("Input the divider: ");
        int div = scanner.nextInt();

        n1 = num/100;
        n2 = num%100/10;
        n3 = num%100%10;

        int sum = n1 + n2 + n3;
        int prod = n1 * n2 *n3;
        int sum_len = (int)(Math.log10(sum) + 1);
        int prod_len = (int)(Math.log10(sum) + 1);

        if(sum_len == 2){
            System.out.println("Sum's length of digits of number " + num + " is equal to 2");
        }
        else {
            System.out.println("Sum's length of digits of number " + num + " is not equal to 2");
        }

        if(prod_len == 3){
            System.out.println("Product's length of digits of number " + num + " is equal to 2");
        }
        else {
            System.out.println("Product's length of digits of number " + num + " is not equal to 3");
        }

        if(sum > num){
            System.out.println("The sum of digits of number " + num + " is grater than this number");
        } else {
            System.out.println("The sum of digits of number " + num + " is not grater than this number");
        }

        if(num%div == 0){
            System.out.println("Input number is divisible by " + div);
        } else {
            System.out.println("Input number is not divisible by " + div);
        }


    }
}
