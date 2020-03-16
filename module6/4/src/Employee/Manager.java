package Employee;

public class Manager implements Employee {

    double fixTale = 100.0;
    double monthSalaryM;
    private double monthIncomeFromM;


    @Override
    public double getMonthSalary() {
        monthIncomeFromM = 100000.0 * Math.random();
        return monthSalaryM = (fixTale + monthIncomeFromM * 0.05);
    }
}

