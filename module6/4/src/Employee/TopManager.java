package Employee;

public class TopManager extends Employee {

    public static final double FIX_PART = 150.0;
    double monthSalary;
    private Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        if (company.getIncome() > 10000000) {
            monthSalary = (FIX_PART + FIX_PART * 1.5);
        } else {
            monthSalary = FIX_PART;
        }
        return monthSalary;
    }

    @Override
    public double getSalesAmount() {
        return 0;
    }
}