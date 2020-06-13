package Employee;

public class Operator extends Employee {

    public static double fixPart = 100.0;

    public Operator() {
        getMonthSalary();
    }

    public String toString() {
        return "Operator";
    }

    @Override
    public double getMonthSalary() {
        return fixPart;
    }

    @Override
    public int compareTo(Employee employee) {
        if (employee.getMonthSalary() > employee.getMonthSalary()) {
            return -1;
        }
        if (employee.getMonthSalary() < employee.getMonthSalary()) {
            return 1;
        } else {
            return 0;
        }
    }
}
