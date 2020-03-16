package Employee;

public class Operator implements Employee {

    double fixTale = 100.0;
    double monthSalaryO;

    @Override
    public double getMonthSalary() {
        return monthSalaryO = fixTale;
    }
}
