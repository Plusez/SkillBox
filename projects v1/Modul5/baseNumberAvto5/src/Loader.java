import java.util.HashMap;
import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {

        HashMap<String, String> baseNumbers = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        for ( ; ; ) {
            System.out.println("Введите номер автомобиля: ");
            String numberAuto = sc.nextLine();
            if (baseNumbers.containsKey(numberAuto)) {
                System.out.printf("Автомобиль принадлежит %s", baseNumbers.get(numberAuto));
            }
            else {Scanner prfio = new Scanner(System.in);
                System.out.println("Введите фамилию владельца: ");
                String fio = prfio.nextLine();
                baseNumbers.put(numberAuto, fio);
            }
        }
    }
}
