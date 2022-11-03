import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number with stays respectively to roman symbols: ");
        int input = scanner.nextInt();

        switch (input){
            case 1:
                System.out.println("I");
                break;
            case 5:
                System.out.println("V");
                break;
            case 10:
                System.out.println("X");
                break;
            case 50:
                System.out.println("L");
                break;
            case 100:
                System.out.println("C");
                break;
            case 500:
                System.out.println("D");
                break;
            case 1000:
                System.out.println("M");
                break;
            default:
                System.out.println("Input another number.");
        }


    }
}
