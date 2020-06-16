package Employee;

public abstract class Employee implements Comparable<Employee> {

    public abstract double getMonthSalary();

    public abstract double getSalesAmount();

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }

    public int compareTo(Employee employee) {
        return Double.compare(employee.getMonthSalary(), getMonthSalary());
    }
}