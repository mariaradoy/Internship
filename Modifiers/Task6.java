//Write a Java method to display the current date and time

import java.text.SimpleDateFormat;
import java.util.Date;

public class methods {

    static void dateTime (){
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE MMMM dd, yyyy HH:mm:ss");
        Date date = new Date();
        System.out.print(formatter.format(date));
    }

    public static void main(String[] args) {
        dateTime();
    }
}
