package Employee;

public class Company {

    private static double income;

    Company() {
        income = 100000000 * Math.random(); // цифра условная, ни к чему не привязана.
    }

    static double getIncome() {
        return income;
    }

    public double hire() {
        return 1;
    }
    public double hireAll() {
        return 1;
    }
    public double fire() {
        return 1;
    }
}

