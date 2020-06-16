package Employee;

public class Operator extends Employee {

    public static final double FIX_PART = 100.0;

    public Operator() {}

    @Override
    public double getMonthSalary() {
        return FIX_PART;
    }

    @Override
    public double getSalesAmount() {
        return 0;
    }
}
