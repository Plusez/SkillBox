
public class Loader {
    public static void main(String[] args) {


        for (int a = 0; a < 2513; a++) {
            char b = (char) a;
            //System.out.println(b);
            String groupAbc = "йцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
            int groupIndex = groupAbc.indexOf(b);
            if (groupIndex == -1) {
                continue;
            } else {
                System.out.println("символ - " + a + " - " + b);
            }
        }
    }
}