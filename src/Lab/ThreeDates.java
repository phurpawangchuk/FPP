package Lab;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class ThreeDates {
    public static void main(String[] args) {
        Date date = new Date();
        GregorianCalendar cal = new GregorianCalendar();
        LocalDate localDate = LocalDate.now();

        System.out.println("date: "+date);
        System.out.println("Gregogrian: "+cal.getTime());
//        localDate.format(DateTimeFormatter.ofPattern("YYYY-MM-DD"));
        System.out.println("LocalDate: "+localDate);
    }
}
