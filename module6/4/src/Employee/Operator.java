package Employee;

public class Operator implements Employee {

    double fixTale = 100.0;
    double monthSalaryO;

    public Operator() {
        getMonthSalary();
    }

    public String toString() {
        return "Operator";
    }

    @Override
    public double getMonthSalary() {
        return monthSalaryO = fixTale;
    }
}
