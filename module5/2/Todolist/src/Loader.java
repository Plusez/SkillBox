import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {

        ArrayList<String> toDoList = new ArrayList<>();
        System.out.println("Создан новый список дел. Перечень команд для управления: 1.LIST, 2.ADD, 3.ADD N, 4.EDIT N, 5.DELETE N");
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите имя команды:");
            String commandName = sc.nextLine();
            int indexOfSpace = commandName.indexOf(" ");
            if (commandName.equals("LIST")) {                                               //LIST
                for (int i = 0; i < toDoList.size(); i++) {
                    System.out.println(i + " - " + toDoList.get(i));
                }
            }
            if (commandName.equals("ADD")) {                                                //ADD
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Введите дело, которое необходимо добавить");
                String someWorkAdd = sc2.nextLine();
                toDoList.add(someWorkAdd);
            }
            if (indexOfSpace == 3) {                                                        //ADD N
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Введите номер строки для внесения дела в список");
                int numOfStrAddN = sc3.nextInt();
                if (toDoList.size() < numOfStrAddN | toDoList.size() == 0) {
                    System.out.println("Номер указан неверно");
                } else {
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Введите название дела для внесения в список");
                    String someWorkAddN = sc4.nextLine();
                    toDoList.add(numOfStrAddN, someWorkAddN);
                }
            }
            if (indexOfSpace == 4) {                                                        //EDIT N
                Scanner sc5 = new Scanner(System.in);
                System.out.println("Введите номер строки для редактирования дела");
                int numOfStrEditN = sc5.nextInt();
                if (toDoList.size() < numOfStrEditN | toDoList.size() == 0) {
                    System.out.println("Номер указан неверно");
                } else {
                    Scanner sc6 = new Scanner(System.in);
                    System.out.printf("Какое дело помещаем в строку %d?", numOfStrEditN);
                    String someWorkEditN = sc6.nextLine();
                    toDoList.add(numOfStrEditN, someWorkEditN);
                    toDoList.remove(numOfStrEditN + 1);
                }
                if (indexOfSpace == 6) {                                                       //DELETE N
                    Scanner sc7 = new Scanner(System.in);
                    System.out.println("Введите номер строки для удаления дела");
                    int numOfStrDel = sc7.nextInt();
                    if (toDoList.size() < numOfStrDel | toDoList.size() == 0) {
                        System.out.println("Номер указан неверно");
                    } else {
                        toDoList.remove(numOfStrDel);
                    }
                } else {
                    System.out.println("Давайте попробуем еще раз");
                }
            }
        }
    }
}