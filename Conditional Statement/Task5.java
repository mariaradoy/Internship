import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n1, n2, n3;

        n1 = num/100;
        n2 = num%100/10;
        n3 = num%100%10;

        if(n1 > n2 && n2 > n3){
            System.out.println(n1 + "" + n2 + "" + n3);
        } else if (n1 > n2 && n1 > n3 && n3 > n2) {
            System.out.println(n1 + "" + n3 + "" + n2);
        }

        else if(n2 > n1 && n1 > n3){
            System.out.println(n2 + "" + n1 + "" + n3);
        } else if (n2 > n1 && n3 > n1) {
            System.out.println(n2 + "" + n3 + "" + n1);
        }

        else if(n3 > n1 && n1 > n2){
            System.out.println(n3 + "" + n1 + "" + n2);
        } else if (n3 > n1 && n2 > n1) {
            System.out.println(n3 + "" + n2 + "" + n1);
        }
    }
}
