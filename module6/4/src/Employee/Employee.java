package Employee;

public abstract class Employee implements Comparable<Employee> {

    public abstract double getMonthSalary();

    public int compareTo(Employee employee) {
        if (getMonthSalary() > employee.getMonthSalary()) {
            return -1;
        }
        if (getMonthSalary() < employee.getMonthSalary()) {
            return 1;
        } else {
            return 0;
        }
    }
}