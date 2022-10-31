import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class exempl {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current Date and Time: " + date);
        Calendar calendarDate = new GregorianCalendar();
        System.out.println("Actual year: " + calendarDate.get(Calendar.YEAR));
        System.out.println("Actual Month: " + calendarDate.get(Calendar.MONTH));
        System.out.println("Actual Weak of Year: " + calendarDate.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Actual Date: " + calendarDate.get(Calendar.DATE));
    }
}
