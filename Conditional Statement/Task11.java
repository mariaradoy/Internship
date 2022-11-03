import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input visitor's age: ");
        int age = scanner.nextInt();
        double base_price = 30d;
        double charge_price = base_price*0.5;

        if(age >= 65){
          System.out.println("Your ticket will cost $" + charge_price);
        }
        else {
            System.out.println("Your ticket will cost $" + base_price);
        }
    }
}
