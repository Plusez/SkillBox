package Employee;

public class TopManager implements Employee {

    double fixTale = 100.0;
    double monthSalaryTM;

    public TopManager() {
        getMonthSalary();
    }

    public String toString() {
        return "TopManager";
    }

    @Override
    public double getMonthSalary() {
        if (Company.getIncome() > 10000000) {
            return monthSalaryTM = (fixTale + fixTale * 1.5);
        }
        else {
            return monthSalaryTM = fixTale;
        }
    }
}


