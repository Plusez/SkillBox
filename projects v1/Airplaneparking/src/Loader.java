import java.util.ArrayList;
import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {

        ArrayList <String> basePlaneNumber = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for( ; ; ) {
            System.out.println("Введите бортовой номер (5 цифр) или команду (exitAll, exitLast: ");
            String anyInput = sc.nextLine().trim();
            if (anyInput.matches("[\\d]+")) {
                String planeNumber = anyInput;
                if (basePlaneNumber.size() 45< 5) {
                    basePlaneNumber.add(planeNumber);
                    //continue;
                }
                else System.out.println("Свободных мест нет");
            }
            else if (anyInput.equals("exitLast")) {
                int j = basePlaneNumber.size() - 1;
                String planeOut = basePlaneNumber.remove(j);
                System.out.printf("Самолет %s вылетает %n", planeOut);
                //System.out.println();
            }
            else if (anyInput.equals("exitAll")) {
                for (int i = basePlaneNumber.size() - 1; i >= 0; i--) {
                    String planeOut = basePlaneNumber.remove(i);
                    System.out.printf("Самолет %s вылетает %n", planeOut);

                }
            }
        }
    }
}
