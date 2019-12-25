import java.util.HashSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SortedSet<String> listMail = new TreeSet<>();
        for (; ; ) {
            System.out.println("Список можно распечатать (list), либо добавить в него новый адрес (add), выберите действие:");
            String command = scanner.nextLine();
            if (command.equals("list")) {
                System.out.println(listMail);
            } else if (command.equals("add")) {
                System.out.println("Введите почтовый адрес");
                String newAddr = scanner.nextLine();
                String pattern = "^\\w{2,}@\\w{2,}.\\w{2,}$";
                Pattern pat = Pattern.compile(pattern);
                Matcher m = pat.matcher(newAddr);
                if (m.find()) {
                    listMail.add(newAddr);
                }
            } else {
                System.out.println("Что-то пошло не так");
            }
        }
    }
}