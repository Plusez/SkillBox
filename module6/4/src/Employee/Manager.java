package Employee;

import java.util.ArrayList;

public class Manager implements Employee {

    double fixTale = 100.0;
    double monthSalaryM;
    double monthIncomeFromM;

    public Manager() {
        monthIncomeFromM = 100000 * Math.random();
        monthSalaryM = (fixTale + monthIncomeFromM * 0.05);
    }

    public String toString() {
        return "Manager";
    }

    @Override
    public double getMonthSalary() {
        return monthSalaryM;
    }
}

