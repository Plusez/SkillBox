import java.util.*;

public class Loader {

    public static void main(String[] args) {

        int pp5;
        int pp2;
        int pp1;
        int pp3;
        int pp4;

        /* К блатным номерам отнесем номера, которые:
        1. включают в себя три одинаковых цифры номера
        2. включают в себя три одинаковых буквы серии
        3. имеют одинаковые цифры номера и региона
        4. имеют номер 000-009
         */

        ArrayList <String> baseGibdd = new ArrayList<>();
        String baseCharr = "укенхваросмт";

        for (pp5 = 1; pp5 < 200; pp5++) {
            Integer prePos5 = pp5;
            for (pp2 = 1; pp2 < 1000; pp2++) {
                Integer prePos2 = pp2;
                for (pp1 = 0; pp1 < baseCharr.length(); pp1++) {
                    String pos1 = baseCharr.substring(pp1, pp1 + 1);
                    for (pp3 = 0; pp3 < baseCharr.length(); pp3++) {
                        String pos3 = baseCharr.substring(pp3, pp3 + 1);
                        for (pp4 = 0; pp4 < baseCharr.length(); pp4++) {
                            String pos4 = baseCharr.substring(pp4, pp4 + 1);
                            if (prePos2 < 10 || prePos2 % 100 == 0 || prePos2 % 111 == 0) {
                                    String pos2 = String.format("%03d", prePos2);
                                    String pos5 = String.format("%03d", prePos5);
                                    String number1 = pos1.concat(pos2);
                                    String number2 = number1.concat(pos3);
                                    String number3 = number2.concat(pos4);
                                    String number4 = number3.concat(pos5);

                                    baseGibdd.add(number4);
                            }
                        }
                    }
                }
            }
        }
        for (pp5 = 1; pp5 < 200; pp5++) {
            Integer prePos5 = pp5;
            for (pp2 = 1; pp2 < 1000; pp2++) {
                Integer prePos2 = pp2;
                for (pp1 = 0; pp1 < baseCharr.length(); pp1++) {
                    String pos1 = baseCharr.substring(pp1, pp1 + 1);
                    for (pp3 = 0; pp3 < baseCharr.length(); pp3++) {
                        String pos3 = baseCharr.substring(pp3, pp3 + 1);
                        for (pp4 = 0; pp4 < baseCharr.length(); pp4++) {
                            String pos4 = baseCharr.substring(pp4, pp4 + 1);
                            if (pos1.equals(pos3)) {
                                if (pos1.equals(pos4)) {
                                    String pos2 = String.format("%03d", prePos2);
                                    String pos5 = String.format("%03d", prePos5);

                                    String number1 = pos1.concat(pos2);
                                    String number2 = number1.concat(pos3);
                                    String number3 = number2.concat(pos4);
                                    String number4 = number3.concat(pos5);

                                    baseGibdd.add(number4);
                                }
                            }
                        }
                    }
                }
            }
        }

        Collections.sort(baseGibdd); //сортировка для бинарного поиска
        Set hashBaseGibdd = Collections.synchronizedSet(new HashSet<>(baseGibdd)); //синхронизация для HashSet
        SortedSet treeBaseGibdd = Collections.synchronizedSortedSet(new TreeSet<>(baseGibdd)); //синхронизация для TreeSet

        Scanner sc = new Scanner(System.in);

        for ( ; ; ) {
            System.out.println("Введите номер: ");
            String inputNumber = sc.nextLine();
// бинарный поиск
            long t1 = System.currentTimeMillis();
            int pos = Collections.binarySearch(baseGibdd, inputNumber);
            if (pos < 0) {
                System.out.printf("Номера %s в базе нет ", inputNumber);
            }
            if (pos >= 0) {
                System.out.printf("Номер %s в базе присутствует ", inputNumber);
            }
            long t2 = System.currentTimeMillis();
            Long t3 = t2 - t1;
            System.out.println(t3 + " мс");
// перебор
            long t4 = System.currentTimeMillis();
            if (baseGibdd.contains(inputNumber)) {
                System.out.printf("Номер %s в базе присутствует ", inputNumber);
            }
            else System.out.printf("Номера %s в базе нет ", inputNumber);
            long t5 = System.currentTimeMillis();
            Long t6 = t5 - t4;
            System.out.println(t6 + " мс");
//HashSet
            long t7 = System.currentTimeMillis();
            if (hashBaseGibdd.contains(inputNumber)) {
                System.out.printf("Номер %s в базе присутствует ", inputNumber);
            }
            else System.out.printf("Номера %s в базе нет ", inputNumber);
            long t8 = System.currentTimeMillis();
            Long t9 = t8 - t7;
            System.out.println(t9 + " мс");
//TreeSet
            long t10 = System.currentTimeMillis();
            if (treeBaseGibdd.contains(inputNumber)) {
                System.out.printf("Номер %s в базе присутствует ", inputNumber);
            }
            else System.out.printf("Номера %s в базе нет ", inputNumber);
            long t11 = System.currentTimeMillis();
            Long t12 = t11 - t10;
            System.out.println(t12 + " мс");

        }
    }
}