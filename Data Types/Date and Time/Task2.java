import java.util.Scanner;

public class exempl {

    static int number_of_days(int year){
        if(vis_year(year) == true){
            return 366;
        }
        else return 365;
    }
    static boolean vis_year(int year){
        return (year%4 == 0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input start year: ");
        int year1 = scanner.nextInt();
        System.out.print("Input end year: ");
        int year2 = scanner.nextInt();

        for (int i = year1; i <= year2; i++){
            System.out.println("Year: " + i + " = " + number_of_days(i));
        }
    }
}
