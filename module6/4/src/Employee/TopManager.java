package Employee;

public class TopManager extends Employee implements Comparable<Employee> {

    double fixPart = 150.0;
    double monthSalary;

    public TopManager() {
        if (Manager.getIncomeCompany() > 10000000) {
            monthSalary = (fixPart + fixPart * 1.5);
        } else {
            monthSalary = fixPart;
        }
    }

    public String toString() {
        return "topManager";
    }

    @Override
    public double getMonthSalary() {
        return monthSalary;
    }

    @Override
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


