import java.util.HashSet;
import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {

        HashSet <String> listMedication = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        for ( ; ; ) {
            System.out.println("Что необходимо добавить в список (просмотреть список - list)?");
            String anyInput = sc.nextLine().trim();
            if (anyInput.equals("list")) {
                for (String name: listMedication) {
                    System.out.println(name);
                }
            }
            else {
                String positionMedication = anyInput;
                listMedication.add(positionMedication);
            }
        }
    }
}
