import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

class DaysOfTheWeek {
    public static void main(String argv[]) {
        Locale usersLocale = Locale.getDefault();

        DateFormatSymbols dfs = new DateFormatSymbols(usersLocale);
        String weekdays[] = dfs.getWeekdays();

        Calendar cal = Calendar.getInstance(usersLocale);

        int firstDayOfWeek = cal.getFirstDayOfWeek();
        int dayOfWeek;

        for (dayOfWeek = firstDayOfWeek; dayOfWeek < weekdays.length; dayOfWeek++)
            System.out.println(weekdays[dayOfWeek]);

        for (dayOfWeek = 0; dayOfWeek < firstDayOfWeek; dayOfWeek++)
            System.out.println(weekdays[dayOfWeek]);
    }
}