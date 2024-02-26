import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateClass {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("date: "+d);
		
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println("GregorianCalendar: "+cal.getTime());
		
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate: "+localDate);
		
		

	}

}
