import Employee.*;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Company OOO = new Company();

        for (int i = 0; i < 10; i++) {                         //нанимаем 10 менеджеров
            Manager manager = new Manager();
            OOO.hire(manager);
        }
        for (int y = 0; y < 10; y++) {                         //нанимаем 10 операторов
            Operator operator = new Operator();
            OOO.hire(operator);
        }
        for (int z = 0; z < 1; z++) {                          //нанимаем 1 топ-менеджеров
            TopManager topManager = new TopManager();
            OOO.hire(topManager);
        }
        System.out.println("Количество сотрудников - " + OOO.quantityEmployee());

        System.out.println("Сортировка по размеру зарплаты");
        Collections.sort(OOO.listEmployee);

        System.out.println("Список 10 наибольших зарплат");
        for (int i = 0; i < 10; i++) {
            System.out.println(OOO.listEmployee.get(i) + " - " + i);
            Employee primer = OOO.listEmployee.get(i);
            System.out.println(primer.getMonthSalary());
        }
        System.out.println("Список 10 наименьших зарплат");
        for (int i = OOO.quantityEmployee() - 1; i >= OOO.quantityEmployee() - 10; i--) {
            System.out.println(OOO.listEmployee.get(i) + " - " + i);
            Employee primer = OOO.listEmployee.get(i);
            System.out.println(primer.getMonthSalary());
        }
        System.out.println("Увольнение  10% сотрудников");
        System.out.println("Количество сотрудников - " + OOO.quantityEmployee());
        int quantityFire = (int) (OOO.listEmployee.size() * 0.1);
        for (int q = 1; q < quantityFire + 1; q++) {
            OOO.fire();
        }
        System.out.println("Количество уволенных - " + quantityFire);
    }
}