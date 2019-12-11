import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    public static void main(String[] args) {

//        //Символы и их коды
//
//        for (int numOfTab = 0; numOfTab < 2513; numOfTab++) {
//            char numOfSim = (char) numOfTab;
//            String groupAbc = "йцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
//            int groupIndex = groupAbc.indexOf(numOfSim);
//            if (groupIndex == -1) {
//                continue;
//            } else {
//                System.out.println("символ - " + numOfTab + " - " + numOfSim);
//            }
//        }
//
//        for (int numOfTab = 0; numOfTab < 2513; numOfTab++) {
//            char numOfSim = (char) numOfTab;
//            String groupAbc = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
//            int groupIndex = groupAbc.indexOf(numOfSim);
//            if (groupIndex == -1) {
//                continue;
//            } else {
//                System.out.println("символ - " + numOfTab + " - " + numOfSim);
//            }
//        }

        //Расчет общего заработка трех человек без регулярных выражений

//        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
//        int allSum = 0;
//        int lengthOfText = text.length();
//        for (int i = 0; i < lengthOfText; i++) {
//            char symbol = text.charAt(i);
//            if (Character.isDigit(symbol)) {
//                String subStrI = text.substring(i);
//                text = subStrI;
//                lengthOfText = text.length();
//                int space = subStrI.indexOf(' ');
//                String subStrSum = subStrI.substring(0, space);
//                int sum = Integer.parseInt(subStrSum.trim());
//                allSum += sum;
//            } else {
//                int someAction = 0; //это какое-то действие, если не выполняется if()
//            }
//        }
//        System.out.println("Summa - " + allSum);

// Расчет общего заработка трех человек с регулярными выражениями

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        Pattern myReg = Pattern.compile("[0-9]+");
        Matcher matcher = myReg.matcher(text);
        int sumX = 0;
        while (matcher.find()) {
            Integer x = Integer.parseInt(text.substring(matcher.start(), matcher.end()));
            sumX += x;
        }
        System.out.println(sumX);

// Очистка номера телефона от лишних знаков.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String input = sc.nextLine();
        String phone = input.replaceAll("[^0-9]", "");
        System.out.println("Номер телефона - " + phone);
        String stateCode = phone.substring(0, 1);
        System.out.println("код страны - " + stateCode);
        String cityCode = phone.substring(1, 4); //в принципе, надо брать справочник кодов и сравнивать - где в коде 4 цифры, а где только 3.
                                                 //С другой стороны - если мы звоним в условный Сургут не из Сургута, то обязательно набираем 10 цифр
                                                 // независимо от количства цифр в коде города.
        System.out.println("код города - " + cityCode);
        String telNum = phone.substring(4, 11);
        System.out.println("номер телефона - " + telNum);
        StringBuffer formPhone = new StringBuffer(phone);
        formPhone.insert(4, ".");
        formPhone.insert(1, ".");
        System.out.println(formPhone);

//Эксперименты с ФИО с регулярными выражениями

        System.out.println("Введите Фамилию Имя Отчество: ");
        Scanner scannerFio = new Scanner(System.in);
        String fullName = scannerFio.nextLine();
        if (!Pattern.compile("[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s" +

                "[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+$").matcher(fullName).matches())

            System.out.println("Неверно введено Ф.И.О.");

        else {

            String[] fullNameArray = fullName.split("\\s");
            System.out.println("Фамилия: " + fullNameArray[0]);
            System.out.println("Имя: " + fullNameArray[1]);
            System.out.println("Отчество: " + fullNameArray[2]);

        }

//Эксперименты с ФИО без регулярных выражений

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите Фамилию Имя Отчество");
//        String input = sc.nextLine();
//        String fullName = input.trim();
//        if (fullName.length() <= 1) {
//            System.out.println("Попробуйте еще раз(1)");
//        } else {
//            int space1 = fullName.indexOf(' '); //выделяем фамилию
//            if (space1 == -1) {
//                System.out.println("Фамилия - " + fullName);
//            } else {
//                String surName = fullName.substring(0, space1);
//                System.out.println("Фамилия - " + surName);
//                String subStr1 = fullName.substring(space1).trim();
//                if (subStr1.length() < 1) {
//                    System.out.println("Попробуйте еще раз(2)");
//                } else {
//                    int space2 = subStr1.indexOf(' '); //выделяем имя
//                    if (space2 < 1) {
//                        System.out.println("Имя - " + subStr1);
//                    } else {
//                        String name = subStr1.substring(0, space2);
//                        System.out.println("Имя - " + name);
//                        String subStr2 = subStr1.substring(space2).trim();
//                        System.out.println("Отчество - " + subStr2);
//                    }
//                }
//            }
//        }
    }
}
