
public class Loader {

    public static void main(String[] args) {

        String[] rainbow = {"Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Violet"};

        System.out.println("Прямая последовательность:");
        for (int i = 0; i < rainbow.length; i++) {
            System.out.println(rainbow[i]);
        }
        System.out.println("Разворот:");
        for (int i = 0; i < (rainbow.length + 1) / 2; i++) {
            String rainbowTemp = rainbow[rainbow.length - i - 1];
            rainbow[rainbow.length - i - 1] = rainbow[i];
            rainbow[i] = rainbowTemp;
        }
        for (int i = 0; i < rainbow.length; i++) {
            System.out.println(rainbow[i]);
        }
    }
}
