public class Loader {

    public static void main(String[] args) {

        String [] rainbow = {"Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Violet"};

        System.out.println("Прямая последовательность:");
        for (int i = 0; i < rainbow.length; i++) {
            System.out.println(rainbow[i]);
        }

        System.out.println("Обратная последовательность:");
        for (int j = rainbow.length - 1; j >= 0; j--) {
            System.out.println(rainbow[j]);
        }

        System.out.println("Разворот:");
        String [] reverseRainbow = new String[rainbow.length];
        for (int r = 0, s = reverseRainbow.length - 1; r < rainbow.length; r++, s--) {
            reverseRainbow[s] = rainbow[r];
        }
        for (int t = 0; t < reverseRainbow.length - 1; t++) {
            System.out.println(reverseRainbow[t]);
        }


    }
}
