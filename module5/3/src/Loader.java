import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {

    public static void main(String[] args) {

        HashSet<String> listMail = new HashSet<>();
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Список можно распечатать (list), либо добавить в него новый адрес (add), выберите действие:");
            String command = sc.nextLine();
            if (command.equals("list")) {
                System.out.println(listMail);
            } else if (command.equals("add")) {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Введите почтовый адрес");
                String newAddr = sc2.nextLine();
                String pattern = "{2,}@\\w{2,}.\\w{2,}$";
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