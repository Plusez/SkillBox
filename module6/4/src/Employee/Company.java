package Employee;

import java.util.ArrayList;

public class Company {

    public ArrayList<Employee> listEmployee = new ArrayList<>();

    public Company() {
    }

    public void hire(Employee employee) {
        listEmployee.add(employee);
    }

    public void fire() {
        int number = ((int) (listEmployee.size() * Math.random()));
        listEmployee.remove(number);
    }

    public int quantityEmployee() {
        return listEmployee.size();
    }
}
