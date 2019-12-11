public class Loader {

    public static void main(String[] args) {

        String str = "Русский\n\tтекст";
        char ch = str.charAt(1);
        System.out.println(str);

        int chCode = (int) ch;
        System.out.println(chCode);
    }
}
