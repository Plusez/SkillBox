public class Loader {

    public static void main(String[] args) {


        for (int a = 1050; a < 1074; a++) {
            char b = (char) a;
            System.out.println(b);
            String groupAbc = "йцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
            int index1 = groupAbc.indexOf(b);
            if (index1 != -1) {
                System.out.println(index1);
            }
            else return;
        }
    }
}





