package gof.creation.factory.simpleFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Date;

public class DateTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale locale = Locale.SIMPLIFIED_CHINESE;
		Date date = new Date();
		String now = DateFormat.getDateInstance(DateFormat.DEFAULT, locale).format(date);
		System.out.println(now);
		
		try {
			date = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale).parse("13:11:12");
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
