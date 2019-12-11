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

        for (int pp5 = 1; pp5 < 100; pp5++) {
            int nRegion = pp5;
            for (int pp2 = 1; pp2 < 1000; pp2++) {
                int nZnak = pp2;
                for (int pp1 = 0; pp1 < baseCharr.length(); pp1++) {
                    char firstLetter = baseCharr.charAt(pp1);
                    for (int pp3 = 0; pp3 < baseCharr.length(); pp3++) {
                        char secondLetter = baseCharr.charAt(pp3);
                        for (int pp4 = 0; pp4 < baseCharr.length(); pp4++) {
                            char thirdLetter = baseCharr.charAt(pp4);
// Проверяем соответствие номера условиям 1, 3, 4.
                            if (nZnak < 10 || nZnak % 100 == 0 || nZnak % 111 == 0 || nZnak == nRegion) {
                                baseGibdd.add(String.format("%s%03d%s%s%03d", firstLetter, nZnak, secondLetter, thirdLetter, nRegion));
                            }
//Проверяем соответствие номера условию 2.
                            else if (firstLetter == secondLetter) {
                                if (firstLetter == thirdLetter) {
                                    baseGibdd.add(String.format("%s%03d%s%s%03d", firstLetter, nZnak, secondLetter, thirdLetter, nRegion));
                                }
                            }
                        }
                    }
                }
            }
        }
        for (String item : baseGibdd) {
            System.out.println(item);
        }
        Collections.sort(baseGibdd); //сортировка для бинарного поиска
        Set hashBaseGibdd = new HashSet<String>(baseGibdd); //синхронизация для HashSet
        SortedSet treeBaseGibdd = Collections.synchronizedSortedSet(new TreeSet<String>(baseGibdd)); //синхронизация для TreeSet

        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Введите номер: ");
            String inputNumber = sc.nextLine();
// бинарный поиск
            long time1 = System.currentTimeMillis();
            int pos = Collections.binarySearch(baseGibdd, inputNumber);
            if (pos < 0) {
                System.out.printf("Номера %s в базе нет ", inputNumber);
            } else System.out.printf("Номер %s в базе присутствует ", inputNumber);
            long time2 = System.currentTimeMillis();
            Long time3 = time2 - time1;
            System.out.println(time3 + " мс");
// перебор
            long time4 = System.currentTimeMillis();
            if (baseGibdd.contains(inputNumber)) {
                System.out.printf("Номер %s в базе присутствует ", inputNumber);
            } else System.out.printf("Номера %s в базе нет ", inputNumber);
            long time5 = System.currentTimeMillis();
            Long time6 = time5 - time4;
            System.out.println(time6 + " мс");
//HashSet
            long time7 = System.currentTimeMillis();
            if (hashBaseGibdd.contains(inputNumber)) {
                System.out.printf("Номер %s в базе присутствует ", inputNumber);
            } else System.out.printf("Номера %s в базе нет ", inputNumber);
            long time8 = System.currentTimeMillis();
            Long time9 = time8 - time7;
            System.out.println(time9 + " мс");
//TreeSet
            long time10 = System.currentTimeMillis();
            if (treeBaseGibdd.contains(inputNumber)) {
                System.out.printf("Номер %s в базе присутствует ", inputNumber);
            } else System.out.printf("Номера %s в базе нет ", inputNumber);
            long time11 = System.currentTimeMillis();
            Long time12 = time11 - time10;
            System.out.println(time12 + " мс");

        }
    }
}