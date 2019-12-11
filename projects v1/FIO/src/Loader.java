import java.util.Scanner;
import java.util.regex.Pattern;

public class Loader {

    public static void main(String[] args) {

        System.out.print("Введите Фамилию Имя Отчество: ");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        if (!Pattern.compile("[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s" +

                "[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+$").matcher(fullName).matches())

            System.out.println("Неверно введено Ф.И.О.");

        else {

            String[] fullNameArray = fullName.split("\\s");
            System.out.println("Фамилия: " + fullNameArray[0]);
            System.out.println("Имя: " + fullNameArray[1]);
            System.out.println("Отчество: " + fullNameArray[2]);

        }
        //Регулярное выражение проверяет введенные ФИО на правильность - три отдельных слова, написанных кириллицей, с большой буквы
    }
}
