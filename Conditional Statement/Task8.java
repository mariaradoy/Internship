import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a day number: ");
        int day = scanner.nextInt();
        System.out.println("Input a month: ");
        int month = scanner.nextInt();
        System.out.println("Input a year: ");
        int year = scanner.nextInt();

        if(month == 12){
            if(day < 31){
                day++;
                System.out.println(day + "." + month + "." + year);
            }
            else {
                day = 1;
                month = 1;
                year++;
                System.out.println(day + "." + month + "." + year);
            }
        }
        else if(month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 1){
            if(day < 31){
                day++;
                System.out.println(day + "." + month + "." + year);
            }
            else {
                day = 1;
                month++;
                System.out.println(day + "." + month + "." + year);
            }
        }

        if(month == 4 || month == 6 || month == 9 || month ==11){
            if(day < 30){
                day++;
                System.out.println(day + "." + month + "." + year);
            }
            else {
                day = 1;
                month++;
                System.out.println(day + "." + month + "." + year);
            }
        }
        if(month == 2){
            if(year%4 != 0){
                if (day < 28) {
                    day++;
                    System.out.println(day + "." + month + "." + year);
                } else {
                    day = 1;
                    month++;
                    System.out.println(day + "." + month + "." + year);
                }
            }
            else {
                if (day < 29) {
                    day++;
                    System.out.println(day + "." + month + "." + year);
                } else {
                    day = 1;
                    month++;
                    System.out.println(day + "." + month + "." + year);
                }
            }
        }

    }
}
