import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Loader {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> toDoList = new ArrayList<>();
        System.out.println("Создан новый список дел. Перечень команд для управления: 1.LIST, 2.ADD, 3.ADD N, 4.EDIT N, 5.DELETE N");

        for (; ; ) {
            String commandToDo = new String();
            String numberPos = new String();
            String nameToDo = new String();
            System.out.println("commandToDo - " + commandToDo);
            System.out.println("numberPos - " + numberPos);
            System.out.println("nameToDo - " + nameToDo);

            System.out.print("Введите имя команды:");
            String commandName = scanner.nextLine();
            String[] commandLine = commandName.split(" ");

            System.out.println();
            if (commandLine.length == 1) {
                commandToDo = commandLine[0];
            } else if (commandLine.length == 2) {
                commandToDo = commandLine[0];
                numberPos = commandLine[1];
            } else if (commandLine.length == 3) {
                commandToDo = commandLine[0];
                numberPos = commandLine[1];
                nameToDo = commandLine[2];
            }

            if (commandToDo.equals("LIST")) {                                                   //LIST
                if (toDoList.size() == 0) {
                    System.out.println("Список пуст");
                } else {
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println(i + " - " + toDoList.get(i));
                    }
                }
            }
            if (commandToDo.equals("ADD") && commandLine.length == 1) {                        //ADD
                System.out.println("Введите дело, которое необходимо добавить(ADD)");
                nameToDo = scanner.nextLine();
                toDoList.add(nameToDo);
            }
            if (commandToDo.equals("ADD") && commandLine.length == 2) {                          //ADD N
                System.out.println("Введите номер строки для внесения дела в список");
                int numberPosThis = scanner.nextInt();
                if (toDoList.size() < numberPosThis || toDoList.size() == 0) {
                    System.out.println("Номер указан неверно");
                } else {
                    System.out.println("Введите дело, которое необходимо добавить (ADD N)");
                    nameToDo = scanner.nextLine();
                    toDoList.add(numberPosThis, nameToDo);
                }
            }
            if (commandToDo.equals("ADD") && commandLine.length == 3) {                               //ADD n text
                if (toDoList.size() < Integer.parseInt(numberPos) || toDoList.size() == 0) {
                    System.out.println("Номер указан неверно");
                } else {
                    int numberPosThis = Integer.parseInt(numberPos);
                    toDoList.add(numberPosThis, nameToDo);
                }
            }
            if (commandToDo.equals("EDIT")) {
                {
                    if (commandLine.length == 2) {                                                        //EDIT N 2 варианта - "EDIT N" и "EDIT n text"
                        System.out.println("Введите номер строки для редактирования дела");
                        int numberPosThis = scanner.nextInt();
                        if (toDoList.size() < numberPosThis || toDoList.size() == 0) {
                            System.out.println("Номер указан неверно");
                        } else {
                            System.out.printf("Какое дело помещаем в строку %d?", numberPosThis);
                            nameToDo = scanner.nextLine();
                            toDoList.add(numberPosThis, nameToDo);
                            toDoList.remove(numberPosThis + 1);
                        }
                    }
                }
                if (commandLine.length == 3) {
                    System.out.println("Введите номер строки для редактирования дела");
                    int numberPosThis = scanner.nextInt();
                    if (toDoList.size() < numberPosThis || toDoList.size() == 0) {
                        System.out.println("Номер указан неверно");
                    } else {
                        toDoList.add(numberPosThis, nameToDo);
                        toDoList.remove(numberPosThis + 1);
                    }
                }
            }
            if (commandToDo.equals("DELETE")) {
                if (numberPos.isEmpty()) {                                                       //DELETE N
                    System.out.println("Введите номер строки для удаления дела");
                    int numberPosThis = scanner.nextInt();
                    if (toDoList.size() < numberPosThis || toDoList.size() == 0) {
                        System.out.println("Номер указан неверно");
                    } else {
                        toDoList.remove(numberPosThis);
                    }
                } else {
                    System.out.println("Давайте попробуем еще раз");
                }
            }
        }
    }
}
