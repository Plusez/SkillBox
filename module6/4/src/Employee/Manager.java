package Employee;

public class Manager extends Employee implements Comparable<Employee> {

    public double fixPart = 100.0;
    public double monthSalary;
    public double monthIncomeFromM;
    public static double incomeCompany;

    public Manager() {
        monthIncomeFromM = 100000.0 * Math.random();
        monthSalary = (fixPart + monthIncomeFromM * 0.05);
        incomeCompany += monthIncomeFromM;
    }

    public static double getIncomeCompany() {
        return incomeCompany;
    }

    public String toString() {
        return "Manager";
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

