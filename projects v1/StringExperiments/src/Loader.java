import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    public static void main(String[] args) {
        Integer sumX = 0;
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);

// Это задание к уроку 4.5 (2)
        String [] incomeTail = text.split (" ");

        Integer mashaIncome = Integer.parseInt(incomeTail[11]);
        Integer vasyaIncome = Integer.parseInt(incomeTail[2]);
        Integer sumIncome = vasyaIncome + mashaIncome;
        System.out.println("Общий доход Васи и Маши составляет - " + sumIncome);

// Это еще вариант задания к уроку 4.5 (2)
        int firstIndexVasya = text.indexOf("5");
        int secondIndexVasya = text.indexOf(" ", firstIndexVasya);
        String stringIncomeVasya = text.substring(firstIndexVasya, secondIndexVasya);
        System.out.println("Доход Васи (метод 2) - " + stringIncomeVasya);
        Integer numberIncomeVasya = Integer.parseInt(stringIncomeVasya);
        int firstIndexMasha = text.lastIndexOf("3");
        int secondIndexMasha = text.lastIndexOf("0");
        String stringIncomeMasha = text.substring(firstIndexMasha, secondIndexMasha + 1); /*Непонятно, почему, но индекс
        последнего вхождения ноля обрезает последний ноль,
        хотя по номерам все должно быть верно.*/
        System.out.println("Доход Маши (метод 2) - " + stringIncomeMasha);
        Integer numberIncomeMasha = Integer.parseInt(stringIncomeMasha);
        Integer sumIncomeMetodTwo = numberIncomeVasya + numberIncomeMasha;
        System.out.println("Доход Васи и Маши по методу 2 - " + sumIncomeMetodTwo);

//  Это задание к уроку 4.7 (1)

        Pattern myReg = Pattern.compile("[0-9]+");
        Matcher matcher = myReg.matcher(text);
        while (matcher.find()) {
            Integer x = Integer.parseInt(text.substring(matcher.start(), matcher.end()));
            System.out.println(sumX = sumX + x);
        }

        /*Насколько я понимаю, мой вариант выбирает все субстроки из строки (соответствия регулярному выражению), конвертирует в цифры
         и складывает их. Вариант в комментарии выделяет субстроки, конвертирует в цифры и присваивает эти значения переменным .
         Если в дальнейшем необходимо работать с переменными, то лучше второй вариант, если будет изменяться строка (добавление
         новых значений) - больше подойдет первый вариант.*/
    }
}