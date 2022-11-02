import java.util.Scanner;

public class exempl {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day_num = 0;
        String name = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                name = "January";
                day_num = 31;
                break;
            case 2:
                name = "February";
                if (((year % 4 == 0) )) {
                    day_num = 29;
                } else {
                    day_num = 28;
                }
                break;
            case 3:
                name = "March";
                day_num = 31;
                break;
            case 4:
                name = "April";
                day_num = 30;
                break;
            case 5:
                name = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                name = "June";
                day_num = 30;
                break;
            case 7:
                name = "July";
                day_num = 31;
                break;
            case 8:
                name = "August";
                day_num = 31;
                break;
            case 9:
                name = "September";
                day_num = 30;
                break;
            case 10:
                name = "October";
                day_num = 31;
                break;
            case 11:
                name = "November";
                day_num = 30;
                break;
            case 12:
                name = "December";
                day_num = 31;
        }
        System.out.print(name + " " + year + " has " + day_num + " days\n");
    }
}
