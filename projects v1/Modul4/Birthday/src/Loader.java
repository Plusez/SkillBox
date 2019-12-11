import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static com.sun.tools.javac.util.Constants.format;
import static com.sun.tools.sjavac.Util.set;
import static jdk.nashorn.internal.objects.NativeDate.getYear;

public class Loader {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату рождения: dd");
        int dd = sc.nextInt();
        System.out.println("Введите месяц рождения: mm");
        int MM = sc.nextInt();
        System.out.println("Введите год рождения: yyyy");
        int yyyy = sc.nextInt();
        int calcYear = yyyy;
        LocalDate birthDate = LocalDate.of(yyyy, MM, dd);
        System.out.println("Дата рождения - " + birthDate);
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int n = 0;
        do {
            LocalDate dateN = birthDate.plusYears(n);
            calcYear = dateN.getYear();
            DayOfWeek dayOfWeek = dateN.getDayOfWeek();
            System.out.print(n + " - ");
            System.out.print(dateN + " - ");
            System.out.println(dayOfWeek);
            n = n + 1;
        } while (currentYear > calcYear);
    }
}
