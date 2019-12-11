import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    public static void main(String[] args) {
        Integer sumX = 0;
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);

// Это задание к уроку 4.5, не удалять
//        String [] incomeTail = text.split (" ");
//
//        Integer mashaIncome = Integer.parseInt(incomeTail[11]);
//        Integer vasyaIncome = Integer.parseInt(incomeTail[2]);
//        Integer sumIncome = vasyaIncome + mashaIncome;
//        System.out.println("Общий доход Васи и Маши составляет - " + sumIncome);

        Pattern myReg = Pattern.compile("[0-9]+");
        Matcher matcher = myReg.matcher(text);
        while (matcher.find()) {
            Integer x = Integer.parseInt(text.substring(matcher.start(), matcher.end()));
            System.out.println(sumX = sumX + x);
        }

    }
}