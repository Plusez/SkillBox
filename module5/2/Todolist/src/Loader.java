import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Loader {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> toDoList = new ArrayList<>();
        System.out.println("Создан новый список дел. Перечень команд для управления: 1.LIST, 2.ADD, 3.ADD N, 4.EDIT N, 5.DELETE N");

        for (; ; ) {
            System.out.println("Введите команду:");
            String commandName = scanner.nextLine();
//            String commandToDo = new String();
//            String numberPos = new String();
//            String nameToDo = new String();
            Pattern mask = Pattern.compile("^([A-Z]{3,6})($|\\s*(\\d*)\\s*(.*))");                                      //^([A-Z]+)\\s*(\\d+)*\\s*(\\w*)?+");
            Matcher mat = mask.matcher(commandName);
            System.out.println(mat.groupCount());
            if (mat.find()) {
                System.out.println("1 - " + mat.group(1));
                System.out.println("2 - " + mat.group(3));
                System.out.println("3 - " + mat.group(4));
            }
            String commandToDo = mat.group(1);
            String numberPos = mat.group(3) != null ? mat.group(3) : "";
            String nameToDo = mat.group(4) != null ? mat.group(4) : "";

            if (commandToDo.equals("LIST")) {                                                                  //LIST
                if (toDoList.size() == 0) {
                    System.out.println("Список пуст");
                } else {
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println(i + " - " + toDoList.get(i));
                    }
                }
                continue;
            }
            if (commandToDo.equals("ADD") && numberPos.isEmpty() && nameToDo.isEmpty()) {                                              //ADD
                System.out.println("Введите дело, которое необходимо добавить(ADD)");
                nameToDo = scanner.nextLine();
                toDoList.add(nameToDo);
                continue;
            }
            if (commandToDo.equals("ADD") && numberPos.isEmpty() && !nameToDo.isEmpty() ) {                    //ADD text
                toDoList.add(nameToDo);
                continue;
            }

            if (commandToDo.equals("ADD") && !numberPos.isEmpty() && nameToDo.length() > 0) {                  //ADD n text
                if ((toDoList.size() < Integer.parseInt(numberPos)) || toDoList.size() == 0) {
                    System.out.println("Номер строки указан неверно");
                } else {
                    int numberPosThis = Integer.parseInt(numberPos);
                    toDoList.add(numberPosThis, nameToDo);
                }
                continue;
            }
            if (commandToDo.equals("EDIT") && !numberPos.isEmpty() && nameToDo.length() > 0) {               //EDIT n text"
                if (toDoList.size() < Integer.parseInt(numberPos) || toDoList.size() == 0) {
                    System.out.println("Номер строки указан неверно");
                } else {
                    int numberPosThis = Integer.parseInt(numberPos);
                    toDoList.add(numberPosThis, nameToDo);
                    toDoList.remove(numberPosThis + 1);
                }
                continue;
            }
            if (commandToDo.equals("DELETE") && !numberPos.isEmpty()) {                                     //DELETE n
                int numberPosThis = Integer.parseInt(numberPos);
                if (toDoList.size() < numberPosThis || toDoList.size() == 0) {
                    System.out.println("Номер указан неверно");
                } else {
                    toDoList.remove(numberPosThis);
                }
                continue;
            } else {
                System.out.println("Давайте попробуем еще раз");
            }
        }
    }
}

