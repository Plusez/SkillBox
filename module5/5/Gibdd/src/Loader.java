import java.util.*;

public class Loader {

    public static void main(String[] args) {

        /* К блатным номерам отнесем номера, которые:
        1. включают в себя три одинаковых цифры номера
        2. включают в себя три одинаковых буквы серии
        3. имеют одинаковые цифры номера и региона
        4. имеют номер 000-009
         */
        /* На всякий случай напишу идею формирования названий для переменных
        Для номера а123вс001:
        а - переменная pp1
        123 - переменная pp2
        в - переменная pp3
        c - переменная pp4
        001 -  переменная pp5
        * */

        ArrayList<String> baseGibdd = new ArrayList<>();
        String baseCharr = "укенхваросмт";

        for (int nRegion = 1; nRegion < 100; nRegion++) {
            for (int nZnak = 1; nZnak < 1000; nZnak++) {
                for (int pp1 = 0; pp1 < baseCharr.length(); pp1++) {
                    char firstLetter = baseCharr.charAt(pp1);
                    for (int pp3 = 0; pp3 < baseCharr.length(); pp3++) {
                        char secondLetter = baseCharr.charAt(pp3);
                        for (int pp4 = 0; pp4 < baseCharr.length(); pp4++) {
                            char thirdLetter = baseCharr.charAt(pp4);
// Проверяем соответствие номера условиям 1, 3, 4.
                            if ((nZnak < 10 || nZnak % 100 == 0 || nZnak % 111 == 0 || nZnak == nRegion) || (firstLetter == secondLetter && firstLetter == thirdLetter)) {
                                baseGibdd.add(String.format("%s%03d%s%s%03d", firstLetter, nZnak, secondLetter, thirdLetter, nRegion));
                            }
//Проверяем соответствие номера условию 2.
//                            else if (firstLetter == secondLetter) {
//                                if (firstLetter == thirdLetter) {
//                                    baseGibdd.add(String.format("%s%03d%s%s%03d", firstLetter, nZnak, secondLetter, thirdLetter, nRegion));
//                                }
//                            }
                        }
                    }
                }
            }
        }
        for (String item : baseGibdd) {
            System.out.println(item);
        }
        Collections.sort(baseGibdd); //сортировка для бинарного поиска
        Set hashBaseGibdd = new HashSet<>(baseGibdd); //синхронизация для HashSet
        Set<String> treeBaseGibdd = new TreeSet<>(baseGibdd); //синхронизация для TreeSet

        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Введите номер: ");
            String inputNumber = sc.nextLine();
// бинарный поиск
            long time1 = System.nanoTime();
            int pos = Collections.binarySearch(baseGibdd, inputNumber);
            if (pos < 0) {
                System.out.printf("Номера %s в базе нет ", inputNumber);
            } else {
                System.out.printf("Номер %s в базе присутствует ", inputNumber);
            }
            long time2 = System.nanoTime();
            Long time3 = time2 - time1;
            System.out.println(time3 + " нс");
// перебор
            long time4 = System.nanoTime();
            if (baseGibdd.contains(inputNumber)) {
                System.out.printf("Номер %s в базе присутствует ", inputNumber);
            } else {
                System.out.printf("Номера %s в базе нет ", inputNumber);
            }
            long time5 = System.nanoTime();
            Long time6 = time5 - time4;
            System.out.println(time6 + " нс");
//HashSet
            long time7 = System.nanoTime();
            if (hashBaseGibdd.contains(inputNumber)) {
                System.out.printf("Номер %s в базе присутствует ", inputNumber);
            } else {
                System.out.printf("Номера %s в базе нет ", inputNumber);
            }
            long time8 = System.nanoTime();
            Long time9 = time8 - time7;
            System.out.println(time9 + " нс");
//TreeSet
            long time10 = System.nanoTime();
            if (treeBaseGibdd.contains(inputNumber)) {
                System.out.printf("Номер %s в базе присутствует ", inputNumber);
            } else {
                System.out.printf("Номера %s в базе нет ", inputNumber);
            }
            long time11 = System.nanoTime();
            Long time12 = time11 - time10;
            System.out.println(time12 + " нс");

            System.out.format("Перебор - %d нс. Оптимален для поиска в небольших структурах, не требует преварительной подготовки структуры данных %n", time3);
            System.out.format("BinarySearch - %d нс. Оптимален для поиска в отсортированных списках %n", time6);
            System.out.format("TreeSet - %d нс. Оптимален для поиска в больших объемах отсортированных уникальных значений %n", time12);
            System.out.format("HashSet - %d нс. Оптимален для поиска в больших объемах уникальных значений %n", time9);
        }
    }
}