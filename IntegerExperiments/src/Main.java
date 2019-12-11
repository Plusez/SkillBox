import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;
        System.out.println(container.count);
        System.out.println("sumDigits: " + sumDigits());
        System.out.println(minMaxDigits());
    }

    public static Integer sumDigits() {
        //@TODO: write code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        Integer number = scanner.nextInt();
        int lengthOfCycle = number.toString().length();
        int sum = 0;
        for (int y = 0; y < lengthOfCycle; y++) {
            char ch = number.toString().charAt(y);
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }

    public static Integer minMaxDigits() {
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(-Double.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        return 0;
    }
}
