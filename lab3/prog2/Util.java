package lab3.prog2;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Util {
	public static final String DATE_FORMAT = "MM/dd/yyyy";
	public static String dateAsString(Date d) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		return f.format(d);
	}
	
	public static String localDateAsString(LocalDate lc) {
		return lc.format(DateTimeFormatter.ofPattern(DATE_FORMAT));
	}
	
}
