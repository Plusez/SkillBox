
public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        for (int a = 0; a < 513; a++) {
            char b = (char) a;
            System.out.println(b);
            String groupAbc = "йцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
            int index1 = groupAbc.indexOf('b');

        }
    }
}