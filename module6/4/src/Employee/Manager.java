package Employee;

public class Manager extends Employee {

    public static final double FIX_PART = 100.0;
    public double monthSalary;
    public double monthIncomeFromM;
    public static double incomeCompany;

    public Manager() {
        monthIncomeFromM = 100000.0 * Math.random();
        monthSalary = (FIX_PART + monthIncomeFromM * 0.05);
        incomeCompany += monthIncomeFromM;
    }

    public static double getIncomeCompany() {
        return incomeCompany;
    }

    @Override
    public double getMonthSalary() {
        return monthSalary;
    }

    @Override
    public double getSalesAmount() {
        return monthIncomeFromM;
    }
}

