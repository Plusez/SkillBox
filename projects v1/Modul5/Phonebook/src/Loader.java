import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

public class Loader {

    public static void main(String[] args) {

        TreeMap<Integer, String> phoneBook = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            //Для вывода всех значений телефонного справочника
            System.out.println("Введите номер телефона (7 цифр), фамилию или наберите List для вывода всех записей: ");
            String anyInput = sc.nextLine().trim();
            if (anyInput.equals("List")) {
                Map <Integer, String> phoneBookSort = phoneBook.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
                for (Integer name: phoneBookSort.keySet()) {
                    System.out.println(name + " - " + phoneBookSort.get(name));
                }
            }
            else {
                // Если введен номер (телефона)
                if (anyInput.matches("\\d{7}")) {
                String normalTelNumber = anyInput.replaceAll("\\D+", "");
                Integer digitTelNumber = Integer.parseInt(normalTelNumber);
                if (phoneBook.containsKey(digitTelNumber)) {
                System.out.println(phoneBook.get(digitTelNumber));
                }
                else {
                    Scanner prFio = new Scanner(System.in);
                    System.out.println("Такой номер в базе отсутствует. Введите Ф.И.О. для записи нового абонента");
                    String fio = prFio.nextLine();
                    //Integer digitTelNumber = Integer.parseInt(normalTelNumber);
                    phoneBook.put(digitTelNumber, fio);
                    System.out.printf("Номер %d - %s успешно добавлен в базу. ", digitTelNumber, fio);
                }
                }
                // Если введен набор символов (Фамилия)
                if (anyInput.matches("\\D+")) {
                    if (phoneBook.containsValue(anyInput)) {
                        System.out.println(phoneBook.get(anyInput));
                    }
                     else {
                        System.out.println("Такая фамилия в базе отсутствует. Введите номер для записи нового абонента");
                        Scanner prTelNumber = new Scanner(System.in);
                        Integer digitTelNumber = prTelNumber.nextInt();
                        phoneBook.put(digitTelNumber, anyInput);
                     }
                }
            }
        }
    }
}
