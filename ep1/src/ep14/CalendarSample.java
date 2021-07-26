package ep14;

import java.util.Calendar;

public class CalendarSample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(1));
//		System.out.println(cal.get(Calendar.YEAR));
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		System.out.println(year + "/" + month + "/" + date);
	}
}
