package Employee;

import javax.swing.*;
import java.util.ArrayList;

public class Company {

    public static double incomeCompany;
    int quantityM = 5;
    // public int i;

    public Company(int quantityM) {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        for (int i = 0; i < quantityM; i++) {
            Manager manager = new Manager();
            incomeCompany += manager.monthIncomeFromM;
            listEmployee.add(manager);
            System.out.println("i " + i);
            System.out.println(listEmployee.get(i));
            System.out.println("monthIncomeFromM " + manager.getMonthSalary());
            System.out.println("incomeCompany " + incomeCompany);
        }
        TopManager topManager = new TopManager();
        System.out.println("topManager.getMonthSalary " + topManager.getMonthSalary());
    }

    //    public String toString() {
//        return "Manager" + i;
//    }
    public static double getIncome() {
        return incomeCompany;
    }

    void hire(int typeEmployee) {
        ArrayList<Employee> list = new ArrayList<Employee>();

        if (typeEmployee == 0) {
            TopManager topManager = new TopManager();
            Company listEmployee.add(topManager);
        }
        if (typeEmployee == 1) {
            Manager manager = new Manager();
            Company listEmployeehire.add(manager);
        }
        if (typeEmployee == 2) {
            Operator operator = new Operator();
            Company listEmployeehire.add(operator);
        }
    }

    public double hireAll() {
        if (quantityM > 0) {

        }
        return 1;
    }

    public double fire() {
        return 1;
    }
}

