//The age of Nicolae - X years and of Mihai - Z years is known. Calculate their average age and their age difference.

import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nick's age is");
        int first_age = scanner.nextInt();
        System.out.print("Mick's age is");
        int second_age = scanner.nextInt();

        int average = (first_age+second_age)/2;
        int difference = 0;
        if(first_age > second_age){
            difference = first_age - second_age;
        }
        else {
            difference = second_age - first_age;
        }

        System.out.println("Avarage age is " + average + "; Difference is " + difference + " age");

    }
}
